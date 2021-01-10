// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasConfigSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasConfigSwitchResponseBody body;

    public static UpdateHasConfigSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasConfigSwitchResponse self = new UpdateHasConfigSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasConfigSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasConfigSwitchResponse setBody(UpdateHasConfigSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasConfigSwitchResponseBody getBody() {
        return this.body;
    }

}
