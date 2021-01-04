// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWifiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagWifiResponseBody body;

    public static ModifySagWifiResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWifiResponse self = new ModifySagWifiResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagWifiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagWifiResponse setBody(ModifySagWifiResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagWifiResponseBody getBody() {
        return this.body;
    }

}
