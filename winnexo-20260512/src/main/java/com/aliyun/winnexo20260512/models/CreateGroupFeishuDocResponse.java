// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupFeishuDocResponseBody body;

    public static CreateGroupFeishuDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuDocResponse self = new CreateGroupFeishuDocResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupFeishuDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupFeishuDocResponse setBody(CreateGroupFeishuDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupFeishuDocResponseBody getBody() {
        return this.body;
    }

}
