// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckIpExistsInSecurityIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckIpExistsInSecurityIpListResponseBody body;

    public static CheckIpExistsInSecurityIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIpExistsInSecurityIpListResponse self = new CheckIpExistsInSecurityIpListResponse();
        return TeaModel.build(map, self);
    }

    public CheckIpExistsInSecurityIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckIpExistsInSecurityIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckIpExistsInSecurityIpListResponse setBody(CheckIpExistsInSecurityIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckIpExistsInSecurityIpListResponseBody getBody() {
        return this.body;
    }

}
