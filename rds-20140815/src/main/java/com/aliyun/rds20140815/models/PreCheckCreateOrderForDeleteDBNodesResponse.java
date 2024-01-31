// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForDeleteDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreCheckCreateOrderForDeleteDBNodesResponseBody body;

    public static PreCheckCreateOrderForDeleteDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForDeleteDBNodesResponse self = new PreCheckCreateOrderForDeleteDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForDeleteDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckCreateOrderForDeleteDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreCheckCreateOrderForDeleteDBNodesResponse setBody(PreCheckCreateOrderForDeleteDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckCreateOrderForDeleteDBNodesResponseBody getBody() {
        return this.body;
    }

}
