// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateBizUserTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NeuronAppToken body;

    public static CreateBizUserTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizUserTokenResponse self = new CreateBizUserTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizUserTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizUserTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizUserTokenResponse setBody(NeuronAppToken body) {
        this.body = body;
        return this;
    }
    public NeuronAppToken getBody() {
        return this.body;
    }

}
