package com.reliab.yandexdriver;

import com.yandex.disk.rest.exceptions.ServerException;
import com.yandex.disk.rest.exceptions.ServerIOException;
import com.yandex.disk.rest.json.DiskInfo;
import com.yandex.disk.rest.json.ResourceList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DriverController {

    private final DiskService diskService;

    @GetMapping("get-info")
    public DiskInfo getDiskInfo() throws ServerIOException, IOException {
        return diskService.getDiskInfo();
    }

    @GetMapping("get-res")
    public ResourceList getResourceList() throws ServerException, IOException {
        return diskService.getResources();
    }
}
