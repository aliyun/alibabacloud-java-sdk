// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListScriptRecordingResponseBody body;

    public static ListScriptRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScriptRecordingResponse self = new ListScriptRecordingResponse();
        return TeaModel.build(map, self);
    }

    public ListScriptRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScriptRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScriptRecordingResponse setBody(ListScriptRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScriptRecordingResponseBody getBody() {
        return this.body;
    }

}
