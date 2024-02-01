// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6InternetBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateIpv6InternetBandwidthResponseBody body;

    public static AllocateIpv6InternetBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6InternetBandwidthResponse self = new AllocateIpv6InternetBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6InternetBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateIpv6InternetBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateIpv6InternetBandwidthResponse setBody(AllocateIpv6InternetBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateIpv6InternetBandwidthResponseBody getBody() {
        return this.body;
    }

}
