// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppRequest extends TeaModel {
    /**
     * <p>The IDs of applications. You can obtain the application ID from the <code>AppId</code> parameter in the response to the <a href="~~CreateAppInfo~~">CreateAppInfo</a> or <a href="~~ListAppInfo~~">ListAppInfo</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The address of an Object Storage Service (OSS) bucket. This parameter does not take effect. You can call this operation to add only VOD buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The storage class. Default value: <strong>vod_oss_bucket</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_oss_bucket</p>
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
