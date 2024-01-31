// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateModelFeatureTrainingSetFGTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelFeatureTrainingSetFGTableResponseBody body;

    public static CreateModelFeatureTrainingSetFGTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelFeatureTrainingSetFGTableResponse self = new CreateModelFeatureTrainingSetFGTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelFeatureTrainingSetFGTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelFeatureTrainingSetFGTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelFeatureTrainingSetFGTableResponse setBody(CreateModelFeatureTrainingSetFGTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelFeatureTrainingSetFGTableResponseBody getBody() {
        return this.body;
    }

}
