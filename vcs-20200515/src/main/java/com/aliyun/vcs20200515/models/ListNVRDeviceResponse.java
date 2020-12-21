// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListNVRDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNVRDeviceResponseBody body;

    public static ListNVRDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNVRDeviceResponse self = new ListNVRDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListNVRDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNVRDeviceResponse setBody(ListNVRDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNVRDeviceResponseBody getBody() {
        return this.body;
    }

}
