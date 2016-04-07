package com.hp.mobile.service;

import com.hp.mobile.domain.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
public interface  DeviceRepository extends JpaRepository<Device, Long> {
//    Page<Device> findAll(Pageable pageable);

    Page<Device> findByName(String name, Pageable pageable);
}
