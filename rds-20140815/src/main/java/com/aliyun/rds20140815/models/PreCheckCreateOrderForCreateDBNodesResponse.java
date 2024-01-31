// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForCreateDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreCheckCreateOrderForCreateDBNodesResponseBody body;

    public static PreCheckCreateOrderForCreateDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForCreateDBNodesResponse self = new PreCheckCreateOrderForCreateDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForCreateDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckCreateOrderForCreateDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreCheckCreateOrderForCreateDBNodesResponse setBody(PreCheckCreateOrderForCreateDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckCreateOrderForCreateDBNodesResponseBody getBody() {
        return this.body;
    }

}
