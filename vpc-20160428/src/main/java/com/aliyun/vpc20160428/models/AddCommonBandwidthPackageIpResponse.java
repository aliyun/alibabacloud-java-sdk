// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCommonBandwidthPackageIpResponseBody body;

    public static AddCommonBandwidthPackageIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpResponse self = new AddCommonBandwidthPackageIpResponse();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCommonBandwidthPackageIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCommonBandwidthPackageIpResponse setBody(AddCommonBandwidthPackageIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCommonBandwidthPackageIpResponseBody getBody() {
        return this.body;
    }

}
