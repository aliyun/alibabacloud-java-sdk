// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagManagementPortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagManagementPortResponseBody body;

    public static ModifySagManagementPortResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagManagementPortResponse self = new ModifySagManagementPortResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagManagementPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagManagementPortResponse setBody(ModifySagManagementPortResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagManagementPortResponseBody getBody() {
        return this.body;
    }

}
