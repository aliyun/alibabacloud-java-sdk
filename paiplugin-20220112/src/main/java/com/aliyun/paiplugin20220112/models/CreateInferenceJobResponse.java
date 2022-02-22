// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInferenceJobResponseBody body;

    public static CreateInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInferenceJobResponse self = new CreateInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInferenceJobResponse setBody(CreateInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInferenceJobResponseBody getBody() {
        return this.body;
    }

}
