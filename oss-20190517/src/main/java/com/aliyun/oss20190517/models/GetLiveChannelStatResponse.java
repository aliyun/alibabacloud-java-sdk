// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveChannelStatResponseBody body;

    public static GetLiveChannelStatResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelStatResponse self = new GetLiveChannelStatResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveChannelStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveChannelStatResponse setBody(GetLiveChannelStatResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveChannelStatResponseBody getBody() {
        return this.body;
    }

}
