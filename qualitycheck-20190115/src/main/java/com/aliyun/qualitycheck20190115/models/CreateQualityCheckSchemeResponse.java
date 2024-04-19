// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateQualityCheckSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityCheckSchemeResponseBody body;

    public static CreateQualityCheckSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckSchemeResponse self = new CreateQualityCheckSchemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityCheckSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityCheckSchemeResponse setBody(CreateQualityCheckSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

}
