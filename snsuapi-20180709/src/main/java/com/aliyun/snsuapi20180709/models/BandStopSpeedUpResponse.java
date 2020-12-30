// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStopSpeedUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandStopSpeedUpResponseBody body;

    public static BandStopSpeedUpResponse build(java.util.Map<String, ?> map) throws Exception {
        BandStopSpeedUpResponse self = new BandStopSpeedUpResponse();
        return TeaModel.build(map, self);
    }

    public BandStopSpeedUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandStopSpeedUpResponse setBody(BandStopSpeedUpResponseBody body) {
        this.body = body;
        return this;
    }
    public BandStopSpeedUpResponseBody getBody() {
        return this.body;
    }

}
