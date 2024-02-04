// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderGeneratingPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntentionOrderGeneratingPayResponseBody body;

    public static CreateIntentionOrderGeneratingPayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentionOrderGeneratingPayResponse self = new CreateIntentionOrderGeneratingPayResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntentionOrderGeneratingPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntentionOrderGeneratingPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntentionOrderGeneratingPayResponse setBody(CreateIntentionOrderGeneratingPayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntentionOrderGeneratingPayResponseBody getBody() {
        return this.body;
    }

}
