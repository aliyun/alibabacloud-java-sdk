// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class MuteAudioAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MuteAudioAllResponseBody body;

    public static MuteAudioAllResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteAudioAllResponse self = new MuteAudioAllResponse();
        return TeaModel.build(map, self);
    }

    public MuteAudioAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteAudioAllResponse setBody(MuteAudioAllResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteAudioAllResponseBody getBody() {
        return this.body;
    }

}
