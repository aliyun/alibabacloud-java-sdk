// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAdditionalBandwidthResponseBody body;

    public static EnableAdditionalBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAdditionalBandwidthResponse self = new EnableAdditionalBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public EnableAdditionalBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAdditionalBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAdditionalBandwidthResponse setBody(EnableAdditionalBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAdditionalBandwidthResponseBody getBody() {
        return this.body;
    }

}
