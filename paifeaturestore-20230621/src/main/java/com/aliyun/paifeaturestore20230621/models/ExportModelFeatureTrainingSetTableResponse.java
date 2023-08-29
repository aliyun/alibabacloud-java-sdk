// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportModelFeatureTrainingSetTableResponseBody body;

    public static ExportModelFeatureTrainingSetTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetTableResponse self = new ExportModelFeatureTrainingSetTableResponse();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportModelFeatureTrainingSetTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportModelFeatureTrainingSetTableResponse setBody(ExportModelFeatureTrainingSetTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportModelFeatureTrainingSetTableResponseBody getBody() {
        return this.body;
    }

}
