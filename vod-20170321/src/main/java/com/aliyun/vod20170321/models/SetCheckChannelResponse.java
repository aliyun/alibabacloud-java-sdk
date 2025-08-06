// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCheckChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCheckChannelResponseBody body;

    public static SetCheckChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCheckChannelResponse self = new SetCheckChannelResponse();
        return TeaModel.build(map, self);
    }

    public SetCheckChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCheckChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCheckChannelResponse setBody(SetCheckChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCheckChannelResponseBody getBody() {
        return this.body;
    }

}
