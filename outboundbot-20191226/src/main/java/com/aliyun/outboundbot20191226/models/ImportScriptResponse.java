// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ImportScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportScriptResponseBody body;

    public static ImportScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportScriptResponse self = new ImportScriptResponse();
        return TeaModel.build(map, self);
    }

    public ImportScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportScriptResponse setBody(ImportScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportScriptResponseBody getBody() {
        return this.body;
    }

}
