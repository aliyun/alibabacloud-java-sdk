// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteLiveChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteLiveChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveChannelResponse self = new DeleteLiveChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
