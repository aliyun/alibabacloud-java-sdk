// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TriggerDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpServiceDeployment body;

    public static TriggerDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerDeploymentResponse self = new TriggerDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public TriggerDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerDeploymentResponse setBody(PdpServiceDeployment body) {
        this.body = body;
        return this;
    }
    public PdpServiceDeployment getBody() {
        return this.body;
    }

}
