// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentTargetsResponseBody body;

    public static ListDeploymentTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTargetsResponse self = new ListDeploymentTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentTargetsResponse setBody(ListDeploymentTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentTargetsResponseBody getBody() {
        return this.body;
    }

}
