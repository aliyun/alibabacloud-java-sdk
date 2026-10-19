// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResizeAIDBClusterModelResponseBody extends TeaModel {
    /**
     * <p>The current measured capacity of the instance. This parameter is returned only when DryRun is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("CurrentCapacity")
    public Long currentCapacity;

    /**
     * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze4x2mwo81knj08a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Indicates whether the current request performed only a capacity dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The capacity that can be directly borrowed from the global pool without reshaping. This parameter is returned only when DryRun is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("PoolHitCapacity")
    public Long poolHitCapacity;

    /**
     * <p>The direct hit ratio of the global pool. Valid values: 0 to 1. This parameter is returned only when DryRun is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>0.75</p>
     */
    @NameInMap("PoolHitRatio")
    public Double poolHitRatio;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The positive difference between the target capacity and the current capacity. This parameter is returned only when DryRun is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("RequiredDelta")
    public Long requiredDelta;

    /**
     * <p>The target total capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>12000</p>
     */
    @NameInMap("TargetCapacity")
    public Long targetCapacity;

    public static ResizeAIDBClusterModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeAIDBClusterModelResponseBody self = new ResizeAIDBClusterModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeAIDBClusterModelResponseBody setCurrentCapacity(Long currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }
    public Long getCurrentCapacity() {
        return this.currentCapacity;
    }

    public ResizeAIDBClusterModelResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ResizeAIDBClusterModelResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResizeAIDBClusterModelResponseBody setPoolHitCapacity(Long poolHitCapacity) {
        this.poolHitCapacity = poolHitCapacity;
        return this;
    }
    public Long getPoolHitCapacity() {
        return this.poolHitCapacity;
    }

    public ResizeAIDBClusterModelResponseBody setPoolHitRatio(Double poolHitRatio) {
        this.poolHitRatio = poolHitRatio;
        return this;
    }
    public Double getPoolHitRatio() {
        return this.poolHitRatio;
    }

    public ResizeAIDBClusterModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResizeAIDBClusterModelResponseBody setRequiredDelta(Long requiredDelta) {
        this.requiredDelta = requiredDelta;
        return this;
    }
    public Long getRequiredDelta() {
        return this.requiredDelta;
    }

    public ResizeAIDBClusterModelResponseBody setTargetCapacity(Long targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

}
