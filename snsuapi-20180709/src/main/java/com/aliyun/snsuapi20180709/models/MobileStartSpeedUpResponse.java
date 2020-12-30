// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class MobileStartSpeedUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MobileStartSpeedUpResponseBody body;

    public static MobileStartSpeedUpResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileStartSpeedUpResponse self = new MobileStartSpeedUpResponse();
        return TeaModel.build(map, self);
    }

    public MobileStartSpeedUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileStartSpeedUpResponse setBody(MobileStartSpeedUpResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileStartSpeedUpResponseBody getBody() {
        return this.body;
    }

}
