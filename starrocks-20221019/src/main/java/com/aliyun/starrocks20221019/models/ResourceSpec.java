// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    @NameInMap("cu")
    public Integer cu;

    @NameInMap("diskNumber")
    public Integer diskNumber;

    @NameInMap("localStorageInstanceType")
    public String localStorageInstanceType;

    @NameInMap("nodeNumber")
    public Integer nodeNumber;

    @NameInMap("specType")
    public String specType;

    @NameInMap("storagePerformanceLevel")
    public String storagePerformanceLevel;

    @NameInMap("storageSize")
    public Integer storageSize;

    public static ResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        ResourceSpec self = new ResourceSpec();
        return TeaModel.build(map, self);
    }

    public ResourceSpec setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public ResourceSpec setDiskNumber(Integer diskNumber) {
        this.diskNumber = diskNumber;
        return this;
    }
    public Integer getDiskNumber() {
        return this.diskNumber;
    }

    public ResourceSpec setLocalStorageInstanceType(String localStorageInstanceType) {
        this.localStorageInstanceType = localStorageInstanceType;
        return this;
    }
    public String getLocalStorageInstanceType() {
        return this.localStorageInstanceType;
    }

    public ResourceSpec setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    public ResourceSpec setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public ResourceSpec setStoragePerformanceLevel(String storagePerformanceLevel) {
        this.storagePerformanceLevel = storagePerformanceLevel;
        return this;
    }
    public String getStoragePerformanceLevel() {
        return this.storagePerformanceLevel;
    }

    public ResourceSpec setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

}
