// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515.models;

import com.aliyun.tea.*;

public class GenerateAcpCompletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public String body;

    public static GenerateAcpCompletionResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAcpCompletionResponse self = new GenerateAcpCompletionResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAcpCompletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAcpCompletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAcpCompletionResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
