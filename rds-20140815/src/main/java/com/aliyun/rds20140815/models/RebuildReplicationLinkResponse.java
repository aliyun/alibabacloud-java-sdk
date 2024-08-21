// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildReplicationLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebuildReplicationLinkResponseBody body;

    public static RebuildReplicationLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildReplicationLinkResponse self = new RebuildReplicationLinkResponse();
        return TeaModel.build(map, self);
    }

    public RebuildReplicationLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildReplicationLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildReplicationLinkResponse setBody(RebuildReplicationLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildReplicationLinkResponseBody getBody() {
        return this.body;
    }

}
