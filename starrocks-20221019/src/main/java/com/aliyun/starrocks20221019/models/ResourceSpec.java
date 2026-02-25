// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    /**
     * <p>The number of CUs. A compute unit (CU) is the basic metering unit of a service. 1 CU = 1 CPU core + 4 GiB of memory.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>The number of disk blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("diskNumber")
    public Integer diskNumber;

    /**
     * <p>Local SSD Instance Specification for the node group. This parameter is applicable only when the node group is based on ECS instances and the SpecType is set to \&quot;Local SSD / Large-capacity Storage\&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>local_ssd_4_4xlarge</p>
     */
    @NameInMap("localStorageInstanceType")
    public String localStorageInstanceType;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nodeNumber")
    public Integer nodeNumber;

    /**
     * <p>The type of the node group. The following types are included:</p>
     * <ul>
     * <li>standard, Standard Edition, ECS + cloud disk.</li>
     * <li>localSSD , local SSD.</li>
     * <li>bigData, which stores large specifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("specType")
    public String specType;

    /**
     * <p>The performance level of the disks. Valid values:</p>
     * <ul>
     * <li>PL0: A single disk can achieve up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single disk can achieve up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single disk can achieve up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single disk can achieve up to 1 million random read/write IOPS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("storagePerformanceLevel")
    public String storagePerformanceLevel;

    /**
     * <p>The storage size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
