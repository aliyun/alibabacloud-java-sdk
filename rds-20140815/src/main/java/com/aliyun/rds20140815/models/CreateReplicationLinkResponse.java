// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReplicationLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReplicationLinkResponseBody body;

    public static CreateReplicationLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationLinkResponse self = new CreateReplicationLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateReplicationLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReplicationLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReplicationLinkResponse setBody(CreateReplicationLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReplicationLinkResponseBody getBody() {
        return this.body;
    }

}
