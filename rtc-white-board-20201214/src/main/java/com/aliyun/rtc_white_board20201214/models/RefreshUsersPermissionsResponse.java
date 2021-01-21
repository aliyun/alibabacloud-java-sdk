// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class RefreshUsersPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshUsersPermissionsResponseBody body;

    public static RefreshUsersPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUsersPermissionsResponse self = new RefreshUsersPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public RefreshUsersPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshUsersPermissionsResponse setBody(RefreshUsersPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshUsersPermissionsResponseBody getBody() {
        return this.body;
    }

}
