// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AssociateRenderingProjectInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateRenderingProjectInstancesResponseBody body;

    public static AssociateRenderingProjectInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRenderingProjectInstancesResponse self = new AssociateRenderingProjectInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AssociateRenderingProjectInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateRenderingProjectInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateRenderingProjectInstancesResponse setBody(AssociateRenderingProjectInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRenderingProjectInstancesResponseBody getBody() {
        return this.body;
    }

}
