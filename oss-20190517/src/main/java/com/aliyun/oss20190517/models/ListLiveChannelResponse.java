// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveChannelResponseBody body;

    public static ListLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveChannelResponse self = new ListLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveChannelResponse setBody(ListLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveChannelResponseBody getBody() {
        return this.body;
    }

}
