// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateChannelResponseBody body;

    public static UpdateChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelResponse self = new UpdateChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChannelResponse setBody(UpdateChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChannelResponseBody getBody() {
        return this.body;
    }

}
