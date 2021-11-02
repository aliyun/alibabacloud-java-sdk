// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeSlotStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeSlotStatusResponseBody body;

    public static ChangeSlotStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeSlotStatusResponse self = new ChangeSlotStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeSlotStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeSlotStatusResponse setBody(ChangeSlotStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeSlotStatusResponseBody getBody() {
        return this.body;
    }

}
