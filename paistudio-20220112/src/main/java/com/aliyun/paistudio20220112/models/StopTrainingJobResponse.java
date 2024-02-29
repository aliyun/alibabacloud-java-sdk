// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StopTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTrainingJobResponseBody body;

    public static StopTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrainingJobResponse self = new StopTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public StopTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTrainingJobResponse setBody(StopTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrainingJobResponseBody getBody() {
        return this.body;
    }

}
