// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetUsersPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetUsersPermissionsResponseBody body;

    public static SetUsersPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUsersPermissionsResponse self = new SetUsersPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public SetUsersPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUsersPermissionsResponse setBody(SetUsersPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUsersPermissionsResponseBody getBody() {
        return this.body;
    }

}
