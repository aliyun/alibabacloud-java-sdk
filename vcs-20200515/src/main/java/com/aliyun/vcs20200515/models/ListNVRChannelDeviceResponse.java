// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRChannelDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNVRChannelDeviceResponseBody body;

    public static ListNVRChannelDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNVRChannelDeviceResponse self = new ListNVRChannelDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListNVRChannelDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNVRChannelDeviceResponse setBody(ListNVRChannelDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNVRChannelDeviceResponseBody getBody() {
        return this.body;
    }

}
