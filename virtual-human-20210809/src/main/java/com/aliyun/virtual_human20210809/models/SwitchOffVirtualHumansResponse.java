// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOffVirtualHumansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchOffVirtualHumansResponseBody body;

    public static SwitchOffVirtualHumansResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchOffVirtualHumansResponse self = new SwitchOffVirtualHumansResponse();
        return TeaModel.build(map, self);
    }

    public SwitchOffVirtualHumansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchOffVirtualHumansResponse setBody(SwitchOffVirtualHumansResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchOffVirtualHumansResponseBody getBody() {
        return this.body;
    }

}
