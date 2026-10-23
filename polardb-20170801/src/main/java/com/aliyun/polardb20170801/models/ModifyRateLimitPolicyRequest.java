// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyRateLimitPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the gateway instance. You can obtain the ID from the GwClusterId parameter returned by CreateGateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The ID of the throttling policy to be modified. You can obtain the ID from the PolicyId parameter returned by CreateRateLimitPolicy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02eccf7c61cf4d05a543075ee907f3**</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The limit on the number of requests per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RateLimitRpm")
    public String rateLimitRpm;

    /**
     * <p>The limit on the number of tokens per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RateLimitTpm")
    public String rateLimitTpm;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRateLimitPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRateLimitPolicyRequest self = new ModifyRateLimitPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRateLimitPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyRateLimitPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ModifyRateLimitPolicyRequest setRateLimitRpm(String rateLimitRpm) {
        this.rateLimitRpm = rateLimitRpm;
        return this;
    }
    public String getRateLimitRpm() {
        return this.rateLimitRpm;
    }

    public ModifyRateLimitPolicyRequest setRateLimitTpm(String rateLimitTpm) {
        this.rateLimitTpm = rateLimitTpm;
        return this;
    }
    public String getRateLimitTpm() {
        return this.rateLimitTpm;
    }

    public ModifyRateLimitPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
