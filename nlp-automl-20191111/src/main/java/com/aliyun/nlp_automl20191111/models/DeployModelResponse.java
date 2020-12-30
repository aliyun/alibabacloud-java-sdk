// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class DeployModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployModelResponseBody body;

    public static DeployModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployModelResponse self = new DeployModelResponse();
        return TeaModel.build(map, self);
    }

    public DeployModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployModelResponse setBody(DeployModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployModelResponseBody getBody() {
        return this.body;
    }

}
