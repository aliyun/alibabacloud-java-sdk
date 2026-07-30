// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourceControlRequest extends TeaModel {
    /**
     * <p>The modified maximum number of CPU cores. The minimum value is 1. The maximum value is determined by the cluster kernel parameter resource_control_cpu_count_limit. You must specify one and only one of this parameter and MaxCpu.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The PolarDB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The modified maximum CPU quota percentage. Valid values: 1 to 100. You must specify one and only one of this parameter and CpuCount.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxCpu")
    public Integer maxCpu;

    /**
     * <p>The region ID of the PolarDB cluster.</p>
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
     * <p>The name of the resource control rule. The name must be 1 to 63 ASCII bytes in length, start with a letter, and can contain only letters, digits, and underscores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rc</p>
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
