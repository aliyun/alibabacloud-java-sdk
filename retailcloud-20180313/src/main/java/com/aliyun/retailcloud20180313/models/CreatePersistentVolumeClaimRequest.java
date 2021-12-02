// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeClaimRequest extends TeaModel {
    @NameInMap("AccessModes")
    public String accessModes;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Capacity")
    public String capacity;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Name")
    public String name;

    @NameInMap("StorageClass")
    public String storageClass;

    public static CreatePersistentVolumeClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeClaimRequest self = new CreatePersistentVolumeClaimRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeClaimRequest setAccessModes(String accessModes) {
        this.accessModes = accessModes;
        return this;
    }
    public String getAccessModes() {
        return this.accessModes;
    }

    public CreatePersistentVolumeClaimRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreatePersistentVolumeClaimRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public CreatePersistentVolumeClaimRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public CreatePersistentVolumeClaimRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersistentVolumeClaimRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
