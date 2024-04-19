// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityCheckSchemeResponseBody body;

    public static UpdateQualityCheckSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckSchemeResponse self = new UpdateQualityCheckSchemeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityCheckSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityCheckSchemeResponse setBody(UpdateQualityCheckSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

}
