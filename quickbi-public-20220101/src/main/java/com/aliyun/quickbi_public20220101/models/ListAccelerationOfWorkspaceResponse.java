// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAccelerationOfWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccelerationOfWorkspaceResponseBody body;

    public static ListAccelerationOfWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerationOfWorkspaceResponse self = new ListAccelerationOfWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListAccelerationOfWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccelerationOfWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccelerationOfWorkspaceResponse setBody(ListAccelerationOfWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccelerationOfWorkspaceResponseBody getBody() {
        return this.body;
    }

}
