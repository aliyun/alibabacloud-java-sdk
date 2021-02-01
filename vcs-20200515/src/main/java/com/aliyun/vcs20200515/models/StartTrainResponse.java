// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartTrainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartTrainResponseBody body;

    public static StartTrainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTrainResponse self = new StartTrainResponse();
        return TeaModel.build(map, self);
    }

    public StartTrainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTrainResponse setBody(StartTrainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTrainResponseBody getBody() {
        return this.body;
    }

}
