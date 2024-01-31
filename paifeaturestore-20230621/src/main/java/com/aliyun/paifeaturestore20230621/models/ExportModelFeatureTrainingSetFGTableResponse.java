// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetFGTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportModelFeatureTrainingSetFGTableResponseBody body;

    public static ExportModelFeatureTrainingSetFGTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetFGTableResponse self = new ExportModelFeatureTrainingSetFGTableResponse();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetFGTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportModelFeatureTrainingSetFGTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportModelFeatureTrainingSetFGTableResponse setBody(ExportModelFeatureTrainingSetFGTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportModelFeatureTrainingSetFGTableResponseBody getBody() {
        return this.body;
    }

}
