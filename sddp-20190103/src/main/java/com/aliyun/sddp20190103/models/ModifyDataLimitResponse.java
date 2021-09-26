// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataLimitResponseBody body;

    public static ModifyDataLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataLimitResponse self = new ModifyDataLimitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataLimitResponse setBody(ModifyDataLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataLimitResponseBody getBody() {
        return this.body;
    }

}
