// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SubmitMaterialTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMaterialTaskResponseBody body;

    public static SubmitMaterialTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMaterialTaskResponse self = new SubmitMaterialTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMaterialTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMaterialTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMaterialTaskResponse setBody(SubmitMaterialTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMaterialTaskResponseBody getBody() {
        return this.body;
    }

}
