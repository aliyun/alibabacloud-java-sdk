// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupAliDingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupAliDingDocResponseBody body;

    public static CreateGroupAliDingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAliDingDocResponse self = new CreateGroupAliDingDocResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupAliDingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupAliDingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupAliDingDocResponse setBody(CreateGroupAliDingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupAliDingDocResponseBody getBody() {
        return this.body;
    }

}
