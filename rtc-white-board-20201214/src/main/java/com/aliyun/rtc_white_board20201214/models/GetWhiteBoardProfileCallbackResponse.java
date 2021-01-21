// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetWhiteBoardProfileCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWhiteBoardProfileCallbackResponseBody body;

    public static GetWhiteBoardProfileCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhiteBoardProfileCallbackResponse self = new GetWhiteBoardProfileCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetWhiteBoardProfileCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhiteBoardProfileCallbackResponse setBody(GetWhiteBoardProfileCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhiteBoardProfileCallbackResponseBody getBody() {
        return this.body;
    }

}
