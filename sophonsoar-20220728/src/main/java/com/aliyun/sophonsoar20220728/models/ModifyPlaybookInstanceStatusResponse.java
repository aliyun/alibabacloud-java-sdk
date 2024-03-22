// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPlaybookInstanceStatusResponseBody body;

    public static ModifyPlaybookInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInstanceStatusResponse self = new ModifyPlaybookInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPlaybookInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPlaybookInstanceStatusResponse setBody(ModifyPlaybookInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPlaybookInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
