// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStopSpeedUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MobileStopSpeedUpResponseBody body;

    public static MobileStopSpeedUpResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileStopSpeedUpResponse self = new MobileStopSpeedUpResponse();
        return TeaModel.build(map, self);
    }

    public MobileStopSpeedUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileStopSpeedUpResponse setBody(MobileStopSpeedUpResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileStopSpeedUpResponseBody getBody() {
        return this.body;
    }

}
