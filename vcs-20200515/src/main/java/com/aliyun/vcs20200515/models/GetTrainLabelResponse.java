// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainLabelResponseBody body;

    public static GetTrainLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainLabelResponse self = new GetTrainLabelResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainLabelResponse setBody(GetTrainLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainLabelResponseBody getBody() {
        return this.body;
    }

}
