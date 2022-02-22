// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainingJobResponseBody body;

    public static GetTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobResponse self = new GetTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainingJobResponse setBody(GetTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainingJobResponseBody getBody() {
        return this.body;
    }

}
