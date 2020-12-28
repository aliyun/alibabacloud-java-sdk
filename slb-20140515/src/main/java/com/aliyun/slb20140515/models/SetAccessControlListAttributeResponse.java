// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessControlListAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAccessControlListAttributeResponseBody body;

    public static SetAccessControlListAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessControlListAttributeResponse self = new SetAccessControlListAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessControlListAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessControlListAttributeResponse setBody(SetAccessControlListAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessControlListAttributeResponseBody getBody() {
        return this.body;
    }

}
