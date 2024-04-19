// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDataResponseBody body;

    public static UploadDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDataResponse self = new UploadDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDataResponse setBody(UploadDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataResponseBody getBody() {
        return this.body;
    }

}
