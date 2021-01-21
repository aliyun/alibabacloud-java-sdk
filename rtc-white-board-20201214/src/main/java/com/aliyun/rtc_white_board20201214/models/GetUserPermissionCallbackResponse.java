// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetUserPermissionCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserPermissionCallbackResponseBody body;

    public static GetUserPermissionCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPermissionCallbackResponse self = new GetUserPermissionCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPermissionCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPermissionCallbackResponse setBody(GetUserPermissionCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPermissionCallbackResponseBody getBody() {
        return this.body;
    }

}
