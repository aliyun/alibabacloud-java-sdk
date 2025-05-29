// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DisassociateRenderingProjectInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateRenderingProjectInstancesResponseBody body;

    public static DisassociateRenderingProjectInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateRenderingProjectInstancesResponse self = new DisassociateRenderingProjectInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateRenderingProjectInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateRenderingProjectInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateRenderingProjectInstancesResponse setBody(DisassociateRenderingProjectInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateRenderingProjectInstancesResponseBody getBody() {
        return this.body;
    }

}
