// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RenewAdditionalBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RenewAdditionalBandwidthResponse setBody(RenewAdditionalBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAdditionalBandwidthResponseBody getBody() {
        return this.body;
    }

}
