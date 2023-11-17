// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPlaybookResponseBody body;

    public static ModifyPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookResponse self = new ModifyPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPlaybookResponse setBody(ModifyPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPlaybookResponseBody getBody() {
        return this.body;
    }

}
