// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairSkvDdbWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTairSkvDdbWorkspaceResponseBody body;

    public static CreateTairSkvDdbWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTairSkvDdbWorkspaceResponse self = new CreateTairSkvDdbWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTairSkvDdbWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTairSkvDdbWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTairSkvDdbWorkspaceResponse setBody(CreateTairSkvDdbWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTairSkvDdbWorkspaceResponseBody getBody() {
        return this.body;
    }

}
