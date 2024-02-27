// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataLevelPermissionWhiteListResponseBody body;

    public static AddDataLevelPermissionWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataLevelPermissionWhiteListResponse self = new AddDataLevelPermissionWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddDataLevelPermissionWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataLevelPermissionWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataLevelPermissionWhiteListResponse setBody(AddDataLevelPermissionWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

}
