// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetLiveChannelHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveChannelHistoryResponseBody body;

    public static GetLiveChannelHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveChannelHistoryResponse self = new GetLiveChannelHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveChannelHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveChannelHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveChannelHistoryResponse setBody(GetLiveChannelHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveChannelHistoryResponseBody getBody() {
        return this.body;
    }

}
