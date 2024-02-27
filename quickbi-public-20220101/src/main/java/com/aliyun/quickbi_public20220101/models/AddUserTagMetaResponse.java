// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserTagMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserTagMetaResponseBody body;

    public static AddUserTagMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserTagMetaResponse self = new AddUserTagMetaResponse();
        return TeaModel.build(map, self);
    }

    public AddUserTagMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserTagMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserTagMetaResponse setBody(AddUserTagMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserTagMetaResponseBody getBody() {
        return this.body;
    }

}
