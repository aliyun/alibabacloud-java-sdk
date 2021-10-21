// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryQrCodeUploadStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryQrCodeUploadStatusResponse setBody(QueryQrCodeUploadStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQrCodeUploadStatusResponseBody getBody() {
        return this.body;
    }

}
