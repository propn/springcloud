package com.propn.sc.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class SysInfo {
    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Map serverInfo() {
        Map map = new HashMap();
        try {
            map.put("status", "success");
            InetAddress address = InetAddress.getLocalHost();
            map.put("HostName", address.getHostName());
            map.put("HostAddress", address.getHostAddress());
            return map;
        } catch (UnknownHostException e) {
            map.put("status", "failed");
            map.put("HostName", "error");
            map.put("HostAddress", "error");
            return map;
        }
    }
}
