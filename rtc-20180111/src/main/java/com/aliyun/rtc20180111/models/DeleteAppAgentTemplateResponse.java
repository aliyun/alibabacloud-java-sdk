// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppAgentTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppAgentTemplateResponseBody body;

    public static DeleteAppAgentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAgentTemplateResponse self = new DeleteAppAgentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppAgentTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppAgentTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppAgentTemplateResponse setBody(DeleteAppAgentTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppAgentTemplateResponseBody getBody() {
        return this.body;
    }

}
