// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CollectedNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CollectedNumberResponseBody body;

    public static CollectedNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectedNumberResponse self = new CollectedNumberResponse();
        return TeaModel.build(map, self);
    }

    public CollectedNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectedNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CollectedNumberResponse setBody(CollectedNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectedNumberResponseBody getBody() {
        return this.body;
    }

}
