// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RenewAdditionalBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAdditionalBandwidthResponseBody body;

    public static RenewAdditionalBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAdditionalBandwidthResponse self = new RenewAdditionalBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public RenewAdditionalBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAdditionalBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAdditionalBandwidthResponse setBody(RenewAdditionalBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAdditionalBandwidthResponseBody getBody() {
        return this.body;
    }

}
