package com.hp.mobile.controller;

import com.hp.mobile.domain.Device;
import com.hp.mobile.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
@Controller
@RequestMapping("/device")
public class DeviceController   {
    @Autowired
    private DeviceService deviceService;

    @RequestMapping(path="/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Device> findAll() {
        return deviceService.findAll();
    }
}
