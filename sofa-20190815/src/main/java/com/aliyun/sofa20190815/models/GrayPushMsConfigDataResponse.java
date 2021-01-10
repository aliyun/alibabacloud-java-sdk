// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GrayPushMsConfigDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrayPushMsConfigDataResponseBody body;

    public static GrayPushMsConfigDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GrayPushMsConfigDataResponse self = new GrayPushMsConfigDataResponse();
        return TeaModel.build(map, self);
    }

    public GrayPushMsConfigDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrayPushMsConfigDataResponse setBody(GrayPushMsConfigDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GrayPushMsConfigDataResponseBody getBody() {
        return this.body;
    }

}
