// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataLevelPermissionWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLevelPermissionWhiteListResponseBody body;

    public static ListDataLevelPermissionWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLevelPermissionWhiteListResponse self = new ListDataLevelPermissionWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLevelPermissionWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLevelPermissionWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLevelPermissionWhiteListResponse setBody(ListDataLevelPermissionWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

}
