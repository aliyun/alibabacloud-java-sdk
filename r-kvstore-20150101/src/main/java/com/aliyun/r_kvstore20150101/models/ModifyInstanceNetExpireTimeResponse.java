// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceNetExpireTimeResponseBody body;

    public static ModifyInstanceNetExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetExpireTimeResponse self = new ModifyInstanceNetExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNetExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceNetExpireTimeResponse setBody(ModifyInstanceNetExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNetExpireTimeResponseBody getBody() {
        return this.body;
    }

}
