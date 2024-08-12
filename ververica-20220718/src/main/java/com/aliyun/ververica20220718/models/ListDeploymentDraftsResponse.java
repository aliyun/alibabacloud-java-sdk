// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentDraftsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentDraftsResponseBody body;

    public static ListDeploymentDraftsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentDraftsResponse self = new ListDeploymentDraftsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentDraftsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentDraftsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentDraftsResponse setBody(ListDeploymentDraftsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentDraftsResponseBody getBody() {
        return this.body;
    }

}
