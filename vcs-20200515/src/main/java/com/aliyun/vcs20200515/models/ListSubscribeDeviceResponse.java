// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListSubscribeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscribeDeviceResponseBody body;

    public static ListSubscribeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeDeviceResponse self = new ListSubscribeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscribeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscribeDeviceResponse setBody(ListSubscribeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscribeDeviceResponseBody getBody() {
        return this.body;
    }

}
