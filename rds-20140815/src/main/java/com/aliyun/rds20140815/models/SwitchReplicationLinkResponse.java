// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchReplicationLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchReplicationLinkResponseBody body;

    public static SwitchReplicationLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchReplicationLinkResponse self = new SwitchReplicationLinkResponse();
        return TeaModel.build(map, self);
    }

    public SwitchReplicationLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchReplicationLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchReplicationLinkResponse setBody(SwitchReplicationLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchReplicationLinkResponseBody getBody() {
        return this.body;
    }

}
