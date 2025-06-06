// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadScriptRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadScriptRecordingResponseBody body;

    public static DownloadScriptRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadScriptRecordingResponse self = new DownloadScriptRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DownloadScriptRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadScriptRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadScriptRecordingResponse setBody(DownloadScriptRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadScriptRecordingResponseBody getBody() {
        return this.body;
    }

}
