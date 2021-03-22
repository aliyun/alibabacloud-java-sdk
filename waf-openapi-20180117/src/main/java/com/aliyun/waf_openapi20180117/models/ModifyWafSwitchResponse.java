// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyWafSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWafSwitchResponseBody body;

    public static ModifyWafSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWafSwitchResponse self = new ModifyWafSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWafSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWafSwitchResponse setBody(ModifyWafSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWafSwitchResponseBody getBody() {
        return this.body;
    }

}
