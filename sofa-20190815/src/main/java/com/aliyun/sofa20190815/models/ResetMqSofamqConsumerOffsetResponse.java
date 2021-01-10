// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetMqSofamqConsumerOffsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetMqSofamqConsumerOffsetResponseBody body;

    public static ResetMqSofamqConsumerOffsetResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetMqSofamqConsumerOffsetResponse self = new ResetMqSofamqConsumerOffsetResponse();
        return TeaModel.build(map, self);
    }

    public ResetMqSofamqConsumerOffsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetMqSofamqConsumerOffsetResponse setBody(ResetMqSofamqConsumerOffsetResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetMqSofamqConsumerOffsetResponseBody getBody() {
        return this.body;
    }

}
