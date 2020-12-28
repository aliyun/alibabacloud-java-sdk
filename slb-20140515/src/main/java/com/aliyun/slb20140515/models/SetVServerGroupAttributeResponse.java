// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetVServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetVServerGroupAttributeResponseBody body;

    public static SetVServerGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVServerGroupAttributeResponse self = new SetVServerGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetVServerGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVServerGroupAttributeResponse setBody(SetVServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
