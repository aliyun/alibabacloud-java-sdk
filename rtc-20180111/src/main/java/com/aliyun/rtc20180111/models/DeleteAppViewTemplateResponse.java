// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppViewTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppViewTemplateResponseBody body;

    public static DeleteAppViewTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppViewTemplateResponse self = new DeleteAppViewTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppViewTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppViewTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppViewTemplateResponse setBody(DeleteAppViewTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppViewTemplateResponseBody getBody() {
        return this.body;
    }

}
