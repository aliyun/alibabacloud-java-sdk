// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSubTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSubTaskResultResponseBody body;

    public static DownloadSubTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSubTaskResultResponse self = new DownloadSubTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSubTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSubTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSubTaskResultResponse setBody(DownloadSubTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSubTaskResultResponseBody getBody() {
        return this.body;
    }

}
