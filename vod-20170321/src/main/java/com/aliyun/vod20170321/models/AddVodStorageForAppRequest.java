// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can obtain the application ID from the response to the [CreateAppInfo](https://help.aliyun.com/zh/vod/developer-reference/api-vod-2017-03-21-createappinfo) or [ListAppInfo](https://help.aliyun.com/zh/vod/developer-reference/api-vod-2017-03-21-listappinfo) operation.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The address of an Object Storage Service (OSS) bucket. This parameter does not take effect. You can call this operation to add only VOD buckets.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The storage type. Default value: vod_oss_bucket.</p>
     */
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
