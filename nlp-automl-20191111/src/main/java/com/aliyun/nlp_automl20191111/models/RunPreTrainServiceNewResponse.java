// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunPreTrainServiceNewResponseBody body;

    public static RunPreTrainServiceNewResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceNewResponse self = new RunPreTrainServiceNewResponse();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPreTrainServiceNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPreTrainServiceNewResponse setBody(RunPreTrainServiceNewResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPreTrainServiceNewResponseBody getBody() {
        return this.body;
    }

}
