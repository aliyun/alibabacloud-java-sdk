// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SaveRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveRecordingResponseBody body;

    public static SaveRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveRecordingResponse self = new SaveRecordingResponse();
        return TeaModel.build(map, self);
    }

    public SaveRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveRecordingResponse setBody(SaveRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveRecordingResponseBody getBody() {
        return this.body;
    }

}
