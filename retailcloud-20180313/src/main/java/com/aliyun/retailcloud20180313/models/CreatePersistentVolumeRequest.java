// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeRequest extends TeaModel {
    @NameInMap("AccessModes")
    public String accessModes;

    @NameInMap("Capacity")
    public String capacity;

    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    @NameInMap("MountDir")
    public String mountDir;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    @NameInMap("NFSVersion")
    public String NFSVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("ReclaimPolicy")
    public String reclaimPolicy;

    @NameInMap("StorageClass")
    public String storageClass;

    public static CreatePersistentVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeRequest self = new CreatePersistentVolumeRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeRequest setAccessModes(String accessModes) {
        this.accessModes = accessModes;
        return this;
    }
    public String getAccessModes() {
        return this.accessModes;
    }

    public CreatePersistentVolumeRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public CreatePersistentVolumeRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public CreatePersistentVolumeRequest setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public CreatePersistentVolumeRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public CreatePersistentVolumeRequest setNFSVersion(String NFSVersion) {
        this.NFSVersion = NFSVersion;
        return this;
    }
    public String getNFSVersion() {
        return this.NFSVersion;
    }

    public CreatePersistentVolumeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersistentVolumeRequest setReclaimPolicy(String reclaimPolicy) {
        this.reclaimPolicy = reclaimPolicy;
        return this;
    }
    public String getReclaimPolicy() {
        return this.reclaimPolicy;
    }

    public CreatePersistentVolumeRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
