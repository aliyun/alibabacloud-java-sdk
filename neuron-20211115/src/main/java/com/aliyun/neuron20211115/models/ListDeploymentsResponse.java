// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpDeploymentPageResult body;

    public static ListDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponse self = new ListDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentsResponse setBody(PdpDeploymentPageResult body) {
        this.body = body;
        return this;
    }
    public PdpDeploymentPageResult getBody() {
        return this.body;
    }

}
