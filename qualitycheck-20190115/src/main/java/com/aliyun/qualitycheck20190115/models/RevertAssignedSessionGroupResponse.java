// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevertAssignedSessionGroupResponseBody body;

    public static RevertAssignedSessionGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionGroupResponse self = new RevertAssignedSessionGroupResponse();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertAssignedSessionGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertAssignedSessionGroupResponse setBody(RevertAssignedSessionGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertAssignedSessionGroupResponseBody getBody() {
        return this.body;
    }

}
