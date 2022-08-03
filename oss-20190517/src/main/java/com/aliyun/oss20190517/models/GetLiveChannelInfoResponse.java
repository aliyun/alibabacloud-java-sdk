// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveChannelInfoResponseBody body;

    public static GetLiveChannelInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelInfoResponse self = new GetLiveChannelInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveChannelInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveChannelInfoResponse setBody(GetLiveChannelInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveChannelInfoResponseBody getBody() {
        return this.body;
    }

}
