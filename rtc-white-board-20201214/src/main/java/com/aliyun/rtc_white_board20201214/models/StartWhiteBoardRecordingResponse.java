// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class StartWhiteBoardRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartWhiteBoardRecordingResponseBody body;

    public static StartWhiteBoardRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartWhiteBoardRecordingResponse self = new StartWhiteBoardRecordingResponse();
        return TeaModel.build(map, self);
    }

    public StartWhiteBoardRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartWhiteBoardRecordingResponse setBody(StartWhiteBoardRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartWhiteBoardRecordingResponseBody getBody() {
        return this.body;
    }

}
