// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CheckWhiteBoardHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckWhiteBoardHostResponseBody body;

    public static CheckWhiteBoardHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckWhiteBoardHostResponse self = new CheckWhiteBoardHostResponse();
        return TeaModel.build(map, self);
    }

    public CheckWhiteBoardHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckWhiteBoardHostResponse setBody(CheckWhiteBoardHostResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckWhiteBoardHostResponseBody getBody() {
        return this.body;
    }

}
