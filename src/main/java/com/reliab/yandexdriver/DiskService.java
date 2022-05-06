package com.reliab.yandexdriver;

import com.yandex.disk.rest.*;
import com.yandex.disk.rest.exceptions.ServerException;
import com.yandex.disk.rest.exceptions.ServerIOException;
import com.yandex.disk.rest.json.DiskInfo;
import com.yandex.disk.rest.json.ResourceList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.InitialContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


@Service
@RequiredArgsConstructor
public class DiskService {

    private final RestClient restClient;

    public DiskInfo getDiskInfo() throws ServerIOException, IOException {
        return restClient.getDiskInfo();
    }

    public ResourceList getResources() throws ServerException, IOException {
        ResourcesArgs.Builder builder = new ResourcesArgs.Builder();
        File file = new File("resources");
        restClient.delete("test.txt", true);

        return restClient.getFlatResourceList(builder.build());
    }

//    public RestClient downloadFile() throws ServerException, IOException {
//        DownloadListener downloadListener = null;
//        restClient.downloadFile("Горы.jpg", downloadListener);
//
//        return null;
//    }

}
