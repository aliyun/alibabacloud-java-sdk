// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DownloadMultimodalSearchTaskResultMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadMultimodalSearchTaskResultMetadataResponseBody body;

    public static DownloadMultimodalSearchTaskResultMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadMultimodalSearchTaskResultMetadataResponse self = new DownloadMultimodalSearchTaskResultMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DownloadMultimodalSearchTaskResultMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadMultimodalSearchTaskResultMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadMultimodalSearchTaskResultMetadataResponse setBody(DownloadMultimodalSearchTaskResultMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadMultimodalSearchTaskResultMetadataResponseBody getBody() {
        return this.body;
    }

}
