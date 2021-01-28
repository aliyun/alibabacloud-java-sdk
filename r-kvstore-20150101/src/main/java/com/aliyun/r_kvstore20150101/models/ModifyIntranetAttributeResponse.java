// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyIntranetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIntranetAttributeResponseBody body;

    public static ModifyIntranetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetAttributeResponse self = new ModifyIntranetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIntranetAttributeResponse setBody(ModifyIntranetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIntranetAttributeResponseBody getBody() {
        return this.body;
    }

}
