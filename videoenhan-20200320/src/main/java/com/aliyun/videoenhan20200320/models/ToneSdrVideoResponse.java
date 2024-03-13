// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ToneSdrVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ToneSdrVideoResponse setBody(ToneSdrVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public ToneSdrVideoResponseBody getBody() {
        return this.body;
    }

}
