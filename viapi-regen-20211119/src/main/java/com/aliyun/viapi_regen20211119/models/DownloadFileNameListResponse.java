// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadFileNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadFileNameListResponseBody body;

    public static DownloadFileNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadFileNameListResponse self = new DownloadFileNameListResponse();
        return TeaModel.build(map, self);
    }

    public DownloadFileNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadFileNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadFileNameListResponse setBody(DownloadFileNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadFileNameListResponseBody getBody() {
        return this.body;
    }

}
