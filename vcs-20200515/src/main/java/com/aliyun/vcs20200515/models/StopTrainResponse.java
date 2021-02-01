// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopTrainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopTrainResponseBody body;

    public static StopTrainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrainResponse self = new StopTrainResponse();
        return TeaModel.build(map, self);
    }

    public StopTrainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrainResponse setBody(StopTrainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrainResponseBody getBody() {
        return this.body;
    }

}
