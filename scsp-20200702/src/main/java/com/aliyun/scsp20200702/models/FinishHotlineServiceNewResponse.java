// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class FinishHotlineServiceNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FinishHotlineServiceNewResponseBody body;

    public static FinishHotlineServiceNewResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishHotlineServiceNewResponse self = new FinishHotlineServiceNewResponse();
        return TeaModel.build(map, self);
    }

    public FinishHotlineServiceNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishHotlineServiceNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishHotlineServiceNewResponse setBody(FinishHotlineServiceNewResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishHotlineServiceNewResponseBody getBody() {
        return this.body;
    }

}
