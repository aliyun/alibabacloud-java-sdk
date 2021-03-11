// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public EnableAdditionalBandwidthResponse setBody(EnableAdditionalBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAdditionalBandwidthResponseBody getBody() {
        return this.body;
    }

}
