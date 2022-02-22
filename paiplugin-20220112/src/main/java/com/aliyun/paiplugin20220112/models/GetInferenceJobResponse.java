// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInferenceJobResponseBody body;

    public static GetInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInferenceJobResponse self = new GetInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public GetInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInferenceJobResponse setBody(GetInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInferenceJobResponseBody getBody() {
        return this.body;
    }

}
