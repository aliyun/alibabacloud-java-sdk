// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetDataLevelPermissionWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataLevelPermissionWhiteListResponse setBody(SetDataLevelPermissionWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

}
