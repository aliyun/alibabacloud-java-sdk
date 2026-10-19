// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunNodeAIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RerunNodeAIResponseBody body;

    public static RerunNodeAIResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunNodeAIResponse self = new RerunNodeAIResponse();
        return TeaModel.build(map, self);
    }

    public RerunNodeAIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunNodeAIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunNodeAIResponse setBody(RerunNodeAIResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunNodeAIResponseBody getBody() {
        return this.body;
    }

}
