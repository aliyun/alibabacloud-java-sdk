// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EnableCrossZone")
    public Boolean enableCrossZone;

    @NameInMap("EnableTrafficAffinity")
    public Boolean enableTrafficAffinity;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroups")
    public java.util.List<String> securityGroups;

    public static UpdateLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeRequest self = new UpdateLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAttributeRequest setEnableCrossZone(Boolean enableCrossZone) {
        this.enableCrossZone = enableCrossZone;
        return this;
    }
    public Boolean getEnableCrossZone() {
        return this.enableCrossZone;
    }

    public UpdateLoadBalancerAttributeRequest setEnableTrafficAffinity(Boolean enableTrafficAffinity) {
        this.enableTrafficAffinity = enableTrafficAffinity;
        return this;
    }
    public Boolean getEnableTrafficAffinity() {
        return this.enableTrafficAffinity;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public UpdateLoadBalancerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLoadBalancerAttributeRequest setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

}
