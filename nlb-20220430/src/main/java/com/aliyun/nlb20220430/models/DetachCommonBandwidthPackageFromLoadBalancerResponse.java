// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody body;

    public static DetachCommonBandwidthPackageFromLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCommonBandwidthPackageFromLoadBalancerResponse self = new DetachCommonBandwidthPackageFromLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse setBody(DetachCommonBandwidthPackageFromLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
