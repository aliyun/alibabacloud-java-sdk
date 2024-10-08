// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteABTestExperimentResponseBody body;

    public static DeleteABTestExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestExperimentResponse self = new DeleteABTestExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABTestExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABTestExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteABTestExperimentResponse setBody(DeleteABTestExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestExperimentResponseBody getBody() {
        return this.body;
    }

}
