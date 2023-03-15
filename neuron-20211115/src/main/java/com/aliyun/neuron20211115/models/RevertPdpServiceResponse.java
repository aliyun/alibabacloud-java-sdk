// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevertPdpServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpServiceDeployment body;

    public static RevertPdpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertPdpServiceResponse self = new RevertPdpServiceResponse();
        return TeaModel.build(map, self);
    }

    public RevertPdpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertPdpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertPdpServiceResponse setBody(PdpServiceDeployment body) {
        this.body = body;
        return this;
    }
    public PdpServiceDeployment getBody() {
        return this.body;
    }

}
