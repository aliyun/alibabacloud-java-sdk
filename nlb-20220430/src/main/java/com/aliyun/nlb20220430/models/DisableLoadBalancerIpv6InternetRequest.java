// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerIpv6InternetRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableLoadBalancerIpv6InternetRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerIpv6InternetRequest self = new DisableLoadBalancerIpv6InternetRequest();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerIpv6InternetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableLoadBalancerIpv6InternetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableLoadBalancerIpv6InternetRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DisableLoadBalancerIpv6InternetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
