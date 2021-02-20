// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MuteAudioResponseBody body;

    public static MuteAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioResponse self = new MuteAudioResponse();
        return TeaModel.build(map, self);
    }

    public MuteAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteAudioResponse setBody(MuteAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteAudioResponseBody getBody() {
        return this.body;
    }

}
