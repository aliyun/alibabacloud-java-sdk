// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class MergeDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MergeDownloadResponseBody body;

    public static MergeDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeDownloadResponse self = new MergeDownloadResponse();
        return TeaModel.build(map, self);
    }

    public MergeDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeDownloadResponse setBody(MergeDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeDownloadResponseBody getBody() {
        return this.body;
    }

}
