// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class StopWhiteBoardRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopWhiteBoardRecordingResponseBody body;

    public static StopWhiteBoardRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopWhiteBoardRecordingResponse self = new StopWhiteBoardRecordingResponse();
        return TeaModel.build(map, self);
    }

    public StopWhiteBoardRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopWhiteBoardRecordingResponse setBody(StopWhiteBoardRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopWhiteBoardRecordingResponseBody getBody() {
        return this.body;
    }

}
