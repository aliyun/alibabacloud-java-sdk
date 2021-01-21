// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetUserProfileCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserProfileCallbackResponseBody body;

    public static GetUserProfileCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserProfileCallbackResponse self = new GetUserProfileCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetUserProfileCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserProfileCallbackResponse setBody(GetUserProfileCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserProfileCallbackResponseBody getBody() {
        return this.body;
    }

}
