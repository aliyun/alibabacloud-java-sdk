// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourceControlRequest extends TeaModel {
    /**
     * <p>The total number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The maximum number of CPUs. Unit: 0.001 CPU. A value of 1000 indicates one CPU. If you specify this parameter, instances whose CPU count is less than the specified value are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("MaxCpu")
    public Integer maxCpu;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource control name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rc</p>
     */
    @NameInMap("ResourceControlName")
    public String resourceControlName;

    public static ModifyResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceControlRequest self = new ModifyResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceControlRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public ModifyResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyResourceControlRequest setMaxCpu(Integer maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Integer getMaxCpu() {
        return this.maxCpu;
    }

    public ModifyResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

}
