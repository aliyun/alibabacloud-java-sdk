// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerRequest extends TeaModel {
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestContent")
    public String requestContent;

    public static DetachCommonBandwidthPackageFromLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCommonBandwidthPackageFromLoadBalancerRequest self = new DetachCommonBandwidthPackageFromLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setRequestContent(String requestContent) {
        this.requestContent = requestContent;
        return this;
    }
    public String getRequestContent() {
        return this.requestContent;
    }

}
