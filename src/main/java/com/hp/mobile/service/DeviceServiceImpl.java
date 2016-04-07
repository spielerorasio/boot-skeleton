package com.hp.mobile.service;

import com.hp.mobile.domain.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    private static final Logger logger = LoggerFactory.getLogger(DeviceServiceImpl.class);

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Device> findAll() {
        logger.info("findAll was called");
        return deviceRepository.findAll();
    }
}
