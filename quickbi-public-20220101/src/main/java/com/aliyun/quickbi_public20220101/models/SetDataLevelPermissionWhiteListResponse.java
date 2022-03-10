// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDataLevelPermissionWhiteListResponseBody body;

    public static SetDataLevelPermissionWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionWhiteListResponse self = new SetDataLevelPermissionWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataLevelPermissionWhiteListResponse setBody(SetDataLevelPermissionWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

}
