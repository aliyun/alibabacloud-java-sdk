// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListLiveChannelResponse setBody(ListLiveChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveChannelResponseBody getBody() {
        return this.body;
    }

}
