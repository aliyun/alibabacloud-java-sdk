// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PublishExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishExperimentResponseBody body;

    public static PublishExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishExperimentResponse self = new PublishExperimentResponse();
        return TeaModel.build(map, self);
    }

    public PublishExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishExperimentResponse setBody(PublishExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishExperimentResponseBody getBody() {
        return this.body;
    }

}
