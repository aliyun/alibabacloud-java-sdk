// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteTrainingJobLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrainingJobLabelsResponseBody body;

    public static DeleteTrainingJobLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainingJobLabelsResponse self = new DeleteTrainingJobLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrainingJobLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrainingJobLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrainingJobLabelsResponse setBody(DeleteTrainingJobLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrainingJobLabelsResponseBody getBody() {
        return this.body;
    }

}
