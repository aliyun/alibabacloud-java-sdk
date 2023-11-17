// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPlaybookInputOutputResponseBody body;

    public static ModifyPlaybookInputOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInputOutputResponse self = new ModifyPlaybookInputOutputResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInputOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPlaybookInputOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPlaybookInputOutputResponse setBody(ModifyPlaybookInputOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPlaybookInputOutputResponseBody getBody() {
        return this.body;
    }

}
