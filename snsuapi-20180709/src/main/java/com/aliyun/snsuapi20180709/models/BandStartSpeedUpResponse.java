// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStartSpeedUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandStartSpeedUpResponseBody body;

    public static BandStartSpeedUpResponse build(java.util.Map<String, ?> map) throws Exception {
        BandStartSpeedUpResponse self = new BandStartSpeedUpResponse();
        return TeaModel.build(map, self);
    }

    public BandStartSpeedUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandStartSpeedUpResponse setBody(BandStartSpeedUpResponseBody body) {
        this.body = body;
        return this;
    }
    public BandStartSpeedUpResponseBody getBody() {
        return this.body;
    }

}
