// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousAdjustResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinuousAdjustResponseBody body;

    public static ContinuousAdjustResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousAdjustResponse self = new ContinuousAdjustResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousAdjustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinuousAdjustResponse setBody(ContinuousAdjustResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuousAdjustResponseBody getBody() {
        return this.body;
    }

}
