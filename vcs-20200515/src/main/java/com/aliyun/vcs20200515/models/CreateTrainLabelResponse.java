// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateTrainLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrainLabelResponseBody body;

    public static CreateTrainLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainLabelResponse self = new CreateTrainLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrainLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrainLabelResponse setBody(CreateTrainLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrainLabelResponseBody getBody() {
        return this.body;
    }

}
