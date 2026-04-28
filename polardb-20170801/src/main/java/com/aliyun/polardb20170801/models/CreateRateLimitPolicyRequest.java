// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateRateLimitPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RateLimitRpm")
    public String rateLimitRpm;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RateLimitTpm")
    public String rateLimitTpm;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-xxxxxxx</p>
     */
    @NameInMap("ScopeRefId")
    public String scopeRefId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ConsumerGroup</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static CreateRateLimitPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRateLimitPolicyRequest self = new CreateRateLimitPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateRateLimitPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateRateLimitPolicyRequest setRateLimitRpm(String rateLimitRpm) {
        this.rateLimitRpm = rateLimitRpm;
        return this;
    }
    public String getRateLimitRpm() {
        return this.rateLimitRpm;
    }

    public CreateRateLimitPolicyRequest setRateLimitTpm(String rateLimitTpm) {
        this.rateLimitTpm = rateLimitTpm;
        return this;
    }
    public String getRateLimitTpm() {
        return this.rateLimitTpm;
    }

    public CreateRateLimitPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRateLimitPolicyRequest setScopeRefId(String scopeRefId) {
        this.scopeRefId = scopeRefId;
        return this;
    }
    public String getScopeRefId() {
        return this.scopeRefId;
    }

    public CreateRateLimitPolicyRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
