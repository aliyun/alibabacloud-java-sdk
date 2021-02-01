// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateTrainLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrainLabelResponseBody body;

    public static UpdateTrainLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainLabelResponse self = new UpdateTrainLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrainLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrainLabelResponse setBody(UpdateTrainLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrainLabelResponseBody getBody() {
        return this.body;
    }

}
