// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOnVirtualHumansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchOnVirtualHumansResponseBody body;

    public static SwitchOnVirtualHumansResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchOnVirtualHumansResponse self = new SwitchOnVirtualHumansResponse();
        return TeaModel.build(map, self);
    }

    public SwitchOnVirtualHumansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchOnVirtualHumansResponse setBody(SwitchOnVirtualHumansResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchOnVirtualHumansResponseBody getBody() {
        return this.body;
    }

}
