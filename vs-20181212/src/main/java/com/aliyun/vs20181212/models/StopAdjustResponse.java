// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopAdjustResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAdjustResponseBody body;

    public static StopAdjustResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAdjustResponse self = new StopAdjustResponse();
        return TeaModel.build(map, self);
    }

    public StopAdjustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAdjustResponse setBody(StopAdjustResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAdjustResponseBody getBody() {
        return this.body;
    }

}
