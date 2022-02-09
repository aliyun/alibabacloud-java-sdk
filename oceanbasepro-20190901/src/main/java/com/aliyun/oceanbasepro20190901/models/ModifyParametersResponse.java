// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyParametersResponseBody body;

    public static ModifyParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersResponse self = new ModifyParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParametersResponse setBody(ModifyParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParametersResponseBody getBody() {
        return this.body;
    }

}
