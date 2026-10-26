// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateResourceControlRequest extends TeaModel {
    /**
     * <p>The maximum number of CPU cores that the resource control rule can use. The minimum value is 1, and the maximum value is determined by the resource_control_cpu_count_limit kernel parameter of the cluster. You must specify exactly one of the MaxCpu and CpuCount parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The ID of the PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The maximum CPU quota percentage that the resource control rule can use. Valid values: 1 to 100. You must specify exactly one of the MaxCpu and CpuCount parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource control rule. The name must be 1 to 63 ASCII characters in length, start with a letter, and contain only letters, digits, and underscores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rc</p>
     */
    @NameInMap("ResourceControlName")
    public String resourceControlName;

    public static CreateResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceControlRequest self = new CreateResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceControlRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public CreateResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateResourceControlRequest setMaxCpu(Integer maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Integer getMaxCpu() {
        return this.maxCpu;
    }

    public CreateResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

}
