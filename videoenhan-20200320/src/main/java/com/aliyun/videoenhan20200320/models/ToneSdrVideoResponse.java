// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ToneSdrVideoResponseBody body;

    public static ToneSdrVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ToneSdrVideoResponse self = new ToneSdrVideoResponse();
        return TeaModel.build(map, self);
    }

    public ToneSdrVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ToneSdrVideoResponse setBody(ToneSdrVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public ToneSdrVideoResponseBody getBody() {
        return this.body;
    }

}
