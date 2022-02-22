// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class DeleteInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInferenceJobResponseBody body;

    public static DeleteInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInferenceJobResponse self = new DeleteInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInferenceJobResponse setBody(DeleteInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInferenceJobResponseBody getBody() {
        return this.body;
    }

}
