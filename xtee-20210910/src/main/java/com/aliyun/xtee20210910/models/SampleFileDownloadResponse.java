// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SampleFileDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SampleFileDownloadResponseBody body;

    public static SampleFileDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        SampleFileDownloadResponse self = new SampleFileDownloadResponse();
        return TeaModel.build(map, self);
    }

    public SampleFileDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SampleFileDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SampleFileDownloadResponse setBody(SampleFileDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public SampleFileDownloadResponseBody getBody() {
        return this.body;
    }

}
