// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class StopJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopJobResponseBody body;

    public static StopJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopJobResponse self = new StopJobResponse();
        return TeaModel.build(map, self);
    }

    public StopJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopJobResponse setBody(StopJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopJobResponseBody getBody() {
        return this.body;
    }

}
