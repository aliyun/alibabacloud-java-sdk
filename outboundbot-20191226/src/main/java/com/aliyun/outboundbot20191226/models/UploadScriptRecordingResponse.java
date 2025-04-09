// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class UploadScriptRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadScriptRecordingResponseBody body;

    public static UploadScriptRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadScriptRecordingResponse self = new UploadScriptRecordingResponse();
        return TeaModel.build(map, self);
    }

    public UploadScriptRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadScriptRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadScriptRecordingResponse setBody(UploadScriptRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadScriptRecordingResponseBody getBody() {
        return this.body;
    }

}
