// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSmapleBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSmapleBatchResponseBody body;

    public static DownloadSmapleBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSmapleBatchResponse self = new DownloadSmapleBatchResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSmapleBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSmapleBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSmapleBatchResponse setBody(DownloadSmapleBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSmapleBatchResponseBody getBody() {
        return this.body;
    }

}
