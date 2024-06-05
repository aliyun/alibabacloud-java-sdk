// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ScanFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScanFileResponseBody body;

    public static ScanFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanFileResponse self = new ScanFileResponse();
        return TeaModel.build(map, self);
    }

    public ScanFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanFileResponse setBody(ScanFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanFileResponseBody getBody() {
        return this.body;
    }

}
