// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginSwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyLoginSwitchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoginSwitchConfigResponse setBody(ModifyLoginSwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoginSwitchConfigResponseBody getBody() {
        return this.body;
    }

}
