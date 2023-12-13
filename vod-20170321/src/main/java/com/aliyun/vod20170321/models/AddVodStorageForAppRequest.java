// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("StorageType")
    public String storageType;

    public static AddVodStorageForAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVodStorageForAppRequest self = new AddVodStorageForAppRequest();
        return TeaModel.build(map, self);
    }

    public AddVodStorageForAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddVodStorageForAppRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public AddVodStorageForAppRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
