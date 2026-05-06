// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSampleFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSampleFileResponseBody body;

    public static DownloadSampleFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadSampleFileResponse self = new DownloadSampleFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadSampleFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSampleFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSampleFileResponse setBody(DownloadSampleFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSampleFileResponseBody getBody() {
        return this.body;
    }

}
