// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class SwitchOffVirtualHumanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchOffVirtualHumanResponseBody body;

    public static SwitchOffVirtualHumanResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchOffVirtualHumanResponse self = new SwitchOffVirtualHumanResponse();
        return TeaModel.build(map, self);
    }

    public SwitchOffVirtualHumanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchOffVirtualHumanResponse setBody(SwitchOffVirtualHumanResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchOffVirtualHumanResponseBody getBody() {
        return this.body;
    }

}
