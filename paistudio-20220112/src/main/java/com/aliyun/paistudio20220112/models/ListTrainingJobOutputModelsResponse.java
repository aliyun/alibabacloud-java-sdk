// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobOutputModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobOutputModelsResponseBody body;

    public static ListTrainingJobOutputModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobOutputModelsResponse self = new ListTrainingJobOutputModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobOutputModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobOutputModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobOutputModelsResponse setBody(ListTrainingJobOutputModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobOutputModelsResponseBody getBody() {
        return this.body;
    }

}
