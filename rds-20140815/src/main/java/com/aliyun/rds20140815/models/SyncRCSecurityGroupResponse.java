// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncRCSecurityGroupResponseBody body;

    public static SyncRCSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRCSecurityGroupResponse self = new SyncRCSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public SyncRCSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncRCSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncRCSecurityGroupResponse setBody(SyncRCSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncRCSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
