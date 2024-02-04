// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadNotaryDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadNotaryDataResponseBody body;

    public static UploadNotaryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryDataResponse self = new UploadNotaryDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadNotaryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadNotaryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadNotaryDataResponse setBody(UploadNotaryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadNotaryDataResponseBody getBody() {
        return this.body;
    }

}
