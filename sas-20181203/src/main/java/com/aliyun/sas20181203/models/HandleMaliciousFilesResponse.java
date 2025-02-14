// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleMaliciousFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleMaliciousFilesResponseBody body;

    public static HandleMaliciousFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleMaliciousFilesResponse self = new HandleMaliciousFilesResponse();
        return TeaModel.build(map, self);
    }

    public HandleMaliciousFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleMaliciousFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleMaliciousFilesResponse setBody(HandleMaliciousFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleMaliciousFilesResponseBody getBody() {
        return this.body;
    }

}
