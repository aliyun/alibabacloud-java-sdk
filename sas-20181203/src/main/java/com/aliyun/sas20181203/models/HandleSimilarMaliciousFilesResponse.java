// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarMaliciousFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleSimilarMaliciousFilesResponseBody body;

    public static HandleSimilarMaliciousFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarMaliciousFilesResponse self = new HandleSimilarMaliciousFilesResponse();
        return TeaModel.build(map, self);
    }

    public HandleSimilarMaliciousFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleSimilarMaliciousFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleSimilarMaliciousFilesResponse setBody(HandleSimilarMaliciousFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleSimilarMaliciousFilesResponseBody getBody() {
        return this.body;
    }

}
