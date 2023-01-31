// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScriptRecordingResponseBody body;

    public static DeleteScriptRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptRecordingResponse self = new DeleteScriptRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScriptRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScriptRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScriptRecordingResponse setBody(DeleteScriptRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScriptRecordingResponseBody getBody() {
        return this.body;
    }

}
