// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutLiveChannelResponseBody body;

    public static PutLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        PutLiveChannelResponse self = new PutLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public PutLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutLiveChannelResponse setBody(PutLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public PutLiveChannelResponseBody getBody() {
        return this.body;
    }

}
