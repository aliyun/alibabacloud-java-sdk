// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CreateWhiteBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWhiteBoardResponseBody body;

    public static CreateWhiteBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhiteBoardResponse self = new CreateWhiteBoardResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhiteBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWhiteBoardResponse setBody(CreateWhiteBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWhiteBoardResponseBody getBody() {
        return this.body;
    }

}
