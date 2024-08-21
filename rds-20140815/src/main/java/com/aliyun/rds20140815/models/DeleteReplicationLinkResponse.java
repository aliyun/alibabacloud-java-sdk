// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteReplicationLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReplicationLinkResponseBody body;

    public static DeleteReplicationLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicationLinkResponse self = new DeleteReplicationLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReplicationLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReplicationLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReplicationLinkResponse setBody(DeleteReplicationLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReplicationLinkResponseBody getBody() {
        return this.body;
    }

}
