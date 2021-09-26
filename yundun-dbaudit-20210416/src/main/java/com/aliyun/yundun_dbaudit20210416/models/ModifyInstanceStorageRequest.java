// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StorageSpace")
    public String storageSpace;

    @NameInMap("StorageCategory")
    public String storageCategory;

    @NameInMap("StorageTime")
    public Integer storageTime;

    public static ModifyInstanceStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageRequest self = new ModifyInstanceStorageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceStorageRequest setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public String getStorageSpace() {
        return this.storageSpace;
    }

    public ModifyInstanceStorageRequest setStorageCategory(String storageCategory) {
        this.storageCategory = storageCategory;
        return this;
    }
    public String getStorageCategory() {
        return this.storageCategory;
    }

    public ModifyInstanceStorageRequest setStorageTime(Integer storageTime) {
        this.storageTime = storageTime;
        return this;
    }
    public Integer getStorageTime() {
        return this.storageTime;
    }

}
