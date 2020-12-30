// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunPreTrainServiceResponseBody body;

    public static RunPreTrainServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceResponse self = new RunPreTrainServiceResponse();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPreTrainServiceResponse setBody(RunPreTrainServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPreTrainServiceResponseBody getBody() {
        return this.body;
    }

}
