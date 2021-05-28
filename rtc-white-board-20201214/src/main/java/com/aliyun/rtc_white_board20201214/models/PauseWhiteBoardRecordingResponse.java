// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class PauseWhiteBoardRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PauseWhiteBoardRecordingResponseBody body;

    public static PauseWhiteBoardRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseWhiteBoardRecordingResponse self = new PauseWhiteBoardRecordingResponse();
        return TeaModel.build(map, self);
    }

    public PauseWhiteBoardRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseWhiteBoardRecordingResponse setBody(PauseWhiteBoardRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseWhiteBoardRecordingResponseBody getBody() {
        return this.body;
    }

}
