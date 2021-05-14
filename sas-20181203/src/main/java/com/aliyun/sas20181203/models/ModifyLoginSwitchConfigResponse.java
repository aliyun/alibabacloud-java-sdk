// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLoginSwitchConfigResponseBody body;

    public static ModifyLoginSwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginSwitchConfigResponse self = new ModifyLoginSwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoginSwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoginSwitchConfigResponse setBody(ModifyLoginSwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoginSwitchConfigResponseBody getBody() {
        return this.body;
    }

}
