// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateTrainingJobLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrainingJobLabelsResponseBody body;

    public static UpdateTrainingJobLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainingJobLabelsResponse self = new UpdateTrainingJobLabelsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrainingJobLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrainingJobLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrainingJobLabelsResponse setBody(UpdateTrainingJobLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrainingJobLabelsResponseBody getBody() {
        return this.body;
    }

}
