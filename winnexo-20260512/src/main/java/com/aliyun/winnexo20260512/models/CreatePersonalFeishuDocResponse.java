// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalFeishuDocResponseBody body;

    public static CreatePersonalFeishuDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuDocResponse self = new CreatePersonalFeishuDocResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalFeishuDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalFeishuDocResponse setBody(CreatePersonalFeishuDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalFeishuDocResponseBody getBody() {
        return this.body;
    }

}
