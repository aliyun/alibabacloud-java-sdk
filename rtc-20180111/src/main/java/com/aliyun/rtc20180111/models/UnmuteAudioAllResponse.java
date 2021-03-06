// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UnmuteAudioAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnmuteAudioAllResponseBody body;

    public static UnmuteAudioAllResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmuteAudioAllResponse self = new UnmuteAudioAllResponse();
        return TeaModel.build(map, self);
    }

    public UnmuteAudioAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmuteAudioAllResponse setBody(UnmuteAudioAllResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmuteAudioAllResponseBody getBody() {
        return this.body;
    }

}
