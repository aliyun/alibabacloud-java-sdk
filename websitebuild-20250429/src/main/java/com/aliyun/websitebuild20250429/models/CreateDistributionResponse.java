// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDistributionResponseBody body;

    public static CreateDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionResponse self = new CreateDistributionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDistributionResponse setBody(CreateDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDistributionResponseBody getBody() {
        return this.body;
    }

}
