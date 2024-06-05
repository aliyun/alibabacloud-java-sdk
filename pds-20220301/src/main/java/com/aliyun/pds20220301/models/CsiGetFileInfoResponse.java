// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CsiGetFileInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CsiGetFileInfoResponseBody body;

    public static CsiGetFileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CsiGetFileInfoResponse self = new CsiGetFileInfoResponse();
        return TeaModel.build(map, self);
    }

    public CsiGetFileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CsiGetFileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CsiGetFileInfoResponse setBody(CsiGetFileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CsiGetFileInfoResponseBody getBody() {
        return this.body;
    }

}
