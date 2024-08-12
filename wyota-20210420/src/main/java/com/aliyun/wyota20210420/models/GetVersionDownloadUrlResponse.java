// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetVersionDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVersionDownloadUrlResponseBody body;

    public static GetVersionDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVersionDownloadUrlResponse self = new GetVersionDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetVersionDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVersionDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVersionDownloadUrlResponse setBody(GetVersionDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVersionDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
