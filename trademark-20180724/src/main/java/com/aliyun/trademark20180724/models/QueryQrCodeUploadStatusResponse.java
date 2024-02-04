// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryQrCodeUploadStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryQrCodeUploadStatusResponseBody body;

    public static QueryQrCodeUploadStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQrCodeUploadStatusResponse self = new QueryQrCodeUploadStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryQrCodeUploadStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQrCodeUploadStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQrCodeUploadStatusResponse setBody(QueryQrCodeUploadStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQrCodeUploadStatusResponseBody getBody() {
        return this.body;
    }

}
