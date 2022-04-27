// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServerGroupServersAttributeResponseBody body;

    public static UpdateServerGroupServersAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupServersAttributeResponse self = new UpdateServerGroupServersAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupServersAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerGroupServersAttributeResponse setBody(UpdateServerGroupServersAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerGroupServersAttributeResponseBody getBody() {
        return this.body;
    }

}
