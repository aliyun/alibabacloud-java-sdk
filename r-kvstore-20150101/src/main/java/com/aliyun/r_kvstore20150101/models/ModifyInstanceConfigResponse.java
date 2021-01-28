// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceConfigResponseBody body;

    public static ModifyInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigResponse self = new ModifyInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceConfigResponse setBody(ModifyInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
