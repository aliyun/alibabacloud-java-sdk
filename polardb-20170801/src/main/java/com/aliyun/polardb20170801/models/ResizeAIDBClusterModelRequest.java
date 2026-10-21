// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResizeAIDBClusterModelRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze4x2mwo81knj08a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to perform a read-only capacity dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID. Requests are routed based on the region to which the instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The target total capacity. The abstract capacity unit is 1000, which equals one L20N equivalent card. The value must be a positive integer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12000</p>
     */
    @NameInMap("TargetCapacity")
    public Long targetCapacity;

    public static ResizeAIDBClusterModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeAIDBClusterModelRequest self = new ResizeAIDBClusterModelRequest();
        return TeaModel.build(map, self);
    }

    public ResizeAIDBClusterModelRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ResizeAIDBClusterModelRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResizeAIDBClusterModelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeAIDBClusterModelRequest setTargetCapacity(Long targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

}
