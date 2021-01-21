// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class OpenWhiteBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenWhiteBoardResponseBody body;

    public static OpenWhiteBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenWhiteBoardResponse self = new OpenWhiteBoardResponse();
        return TeaModel.build(map, self);
    }

    public OpenWhiteBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenWhiteBoardResponse setBody(OpenWhiteBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenWhiteBoardResponseBody getBody() {
        return this.body;
    }

}
