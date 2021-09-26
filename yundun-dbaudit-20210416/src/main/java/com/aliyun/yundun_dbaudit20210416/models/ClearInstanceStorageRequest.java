// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class ClearInstanceStorageRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StorageSpace")
    public String storageSpace;

    @NameInMap("StorageCategory")
    public String storageCategory;

    public static ClearInstanceStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceStorageRequest self = new ClearInstanceStorageRequest();
        return TeaModel.build(map, self);
    }

    public ClearInstanceStorageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClearInstanceStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ClearInstanceStorageRequest setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public String getStorageSpace() {
        return this.storageSpace;
    }

    public ClearInstanceStorageRequest setStorageCategory(String storageCategory) {
        this.storageCategory = storageCategory;
        return this;
    }
    public String getStorageCategory() {
        return this.storageCategory;
    }

}
