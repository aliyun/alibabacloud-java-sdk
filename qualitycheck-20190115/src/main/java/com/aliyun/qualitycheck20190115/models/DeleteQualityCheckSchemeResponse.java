// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteQualityCheckSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityCheckSchemeResponseBody body;

    public static DeleteQualityCheckSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityCheckSchemeResponse self = new DeleteQualityCheckSchemeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityCheckSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityCheckSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityCheckSchemeResponse setBody(DeleteQualityCheckSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

}
