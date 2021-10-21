// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderGeneratingPayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateIntentionOrderGeneratingPayResponse setBody(CreateIntentionOrderGeneratingPayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntentionOrderGeneratingPayResponseBody getBody() {
        return this.body;
    }

}
