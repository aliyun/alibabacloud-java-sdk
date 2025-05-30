// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadRecordingResponseBody body;

    public static DownloadRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingResponse self = new DownloadRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadRecordingResponse setBody(DownloadRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadRecordingResponseBody getBody() {
        return this.body;
    }

}
