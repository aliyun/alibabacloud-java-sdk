// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsConsumerResetOffsetResponseBody body;

    public static OnsConsumerResetOffsetResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerResetOffsetResponse self = new OnsConsumerResetOffsetResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerResetOffsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerResetOffsetResponse setBody(OnsConsumerResetOffsetResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerResetOffsetResponseBody getBody() {
        return this.body;
    }

}
