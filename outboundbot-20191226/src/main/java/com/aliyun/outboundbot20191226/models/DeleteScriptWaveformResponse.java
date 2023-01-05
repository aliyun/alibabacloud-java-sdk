// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptWaveformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScriptWaveformResponseBody body;

    public static DeleteScriptWaveformResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptWaveformResponse self = new DeleteScriptWaveformResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScriptWaveformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScriptWaveformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScriptWaveformResponse setBody(DeleteScriptWaveformResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScriptWaveformResponseBody getBody() {
        return this.body;
    }

}
