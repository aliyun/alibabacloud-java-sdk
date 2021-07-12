// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SyncDeviceChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncDeviceChannelsResponseBody body;

    public static SyncDeviceChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceChannelsResponse self = new SyncDeviceChannelsResponse();
        return TeaModel.build(map, self);
    }

    public SyncDeviceChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDeviceChannelsResponse setBody(SyncDeviceChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDeviceChannelsResponseBody getBody() {
        return this.body;
    }

}
