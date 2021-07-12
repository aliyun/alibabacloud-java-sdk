// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceChannelsResponseBody body;

    public static ListDeviceChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceChannelsResponse self = new ListDeviceChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceChannelsResponse setBody(ListDeviceChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceChannelsResponseBody getBody() {
        return this.body;
    }

}
