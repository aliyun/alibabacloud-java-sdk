// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSortScriptResponseBody body;

    public static CreateSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSortScriptResponse self = new CreateSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public CreateSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSortScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSortScriptResponse setBody(CreateSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSortScriptResponseBody getBody() {
        return this.body;
    }

}
