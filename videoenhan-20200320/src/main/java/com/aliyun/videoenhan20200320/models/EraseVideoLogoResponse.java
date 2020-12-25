// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EraseVideoLogoResponseBody body;

    public static EraseVideoLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponse self = new EraseVideoLogoResponse();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EraseVideoLogoResponse setBody(EraseVideoLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public EraseVideoLogoResponseBody getBody() {
        return this.body;
    }

}
