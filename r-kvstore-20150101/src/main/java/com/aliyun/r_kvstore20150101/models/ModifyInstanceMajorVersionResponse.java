// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMajorVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceMajorVersionResponseBody body;

    public static ModifyInstanceMajorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMajorVersionResponse self = new ModifyInstanceMajorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMajorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMajorVersionResponse setBody(ModifyInstanceMajorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMajorVersionResponseBody getBody() {
        return this.body;
    }

}
