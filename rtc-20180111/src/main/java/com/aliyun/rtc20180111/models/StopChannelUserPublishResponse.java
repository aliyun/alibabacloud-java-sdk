// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopChannelUserPublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopChannelUserPublishResponseBody body;

    public static StopChannelUserPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        StopChannelUserPublishResponse self = new StopChannelUserPublishResponse();
        return TeaModel.build(map, self);
    }

    public StopChannelUserPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopChannelUserPublishResponse setBody(StopChannelUserPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public StopChannelUserPublishResponseBody getBody() {
        return this.body;
    }

}
