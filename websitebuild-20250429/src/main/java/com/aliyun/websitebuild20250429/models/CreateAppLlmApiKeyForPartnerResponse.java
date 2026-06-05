// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppLlmApiKeyForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppLlmApiKeyForPartnerResponseBody body;

    public static CreateAppLlmApiKeyForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLlmApiKeyForPartnerResponse self = new CreateAppLlmApiKeyForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppLlmApiKeyForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppLlmApiKeyForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppLlmApiKeyForPartnerResponse setBody(CreateAppLlmApiKeyForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppLlmApiKeyForPartnerResponseBody getBody() {
        return this.body;
    }

}
