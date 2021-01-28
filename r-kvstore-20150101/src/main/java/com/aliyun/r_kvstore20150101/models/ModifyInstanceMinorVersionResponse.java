// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceMinorVersionResponseBody body;

    public static ModifyInstanceMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMinorVersionResponse self = new ModifyInstanceMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMinorVersionResponse setBody(ModifyInstanceMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMinorVersionResponseBody getBody() {
        return this.body;
    }

}
