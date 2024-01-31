// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class JoinWebLockProcessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinWebLockProcessWhiteListResponseBody body;

    public static JoinWebLockProcessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinWebLockProcessWhiteListResponse self = new JoinWebLockProcessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public JoinWebLockProcessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinWebLockProcessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinWebLockProcessWhiteListResponse setBody(JoinWebLockProcessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinWebLockProcessWhiteListResponseBody getBody() {
        return this.body;
    }

}
