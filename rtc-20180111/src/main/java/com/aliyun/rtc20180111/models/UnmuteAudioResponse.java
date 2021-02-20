// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UnmuteAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnmuteAudioResponseBody body;

    public static UnmuteAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmuteAudioResponse self = new UnmuteAudioResponse();
        return TeaModel.build(map, self);
    }

    public UnmuteAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmuteAudioResponse setBody(UnmuteAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmuteAudioResponseBody getBody() {
        return this.body;
    }

}
