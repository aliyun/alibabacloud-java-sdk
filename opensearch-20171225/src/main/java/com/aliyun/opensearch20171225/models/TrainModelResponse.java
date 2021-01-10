// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class TrainModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TrainModelResponseBody body;

    public static TrainModelResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainModelResponse self = new TrainModelResponse();
        return TeaModel.build(map, self);
    }

    public TrainModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainModelResponse setBody(TrainModelResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainModelResponseBody getBody() {
        return this.body;
    }

}
