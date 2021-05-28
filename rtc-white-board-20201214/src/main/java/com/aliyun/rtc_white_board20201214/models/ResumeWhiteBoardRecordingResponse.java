// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class ResumeWhiteBoardRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeWhiteBoardRecordingResponseBody body;

    public static ResumeWhiteBoardRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeWhiteBoardRecordingResponse self = new ResumeWhiteBoardRecordingResponse();
        return TeaModel.build(map, self);
    }

    public ResumeWhiteBoardRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeWhiteBoardRecordingResponse setBody(ResumeWhiteBoardRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeWhiteBoardRecordingResponseBody getBody() {
        return this.body;
    }

}
