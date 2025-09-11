// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckDatasetExistedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDatasetExistedResponseBody body;

    public static CheckDatasetExistedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetExistedResponse self = new CheckDatasetExistedResponse();
        return TeaModel.build(map, self);
    }

    public CheckDatasetExistedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDatasetExistedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDatasetExistedResponse setBody(CheckDatasetExistedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDatasetExistedResponseBody getBody() {
        return this.body;
    }

}
