// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogRetrievalStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogRetrievalStatusResponseBody body;

    public static ModifyLogRetrievalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogRetrievalStatusResponse self = new ModifyLogRetrievalStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogRetrievalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogRetrievalStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogRetrievalStatusResponse setBody(ModifyLogRetrievalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogRetrievalStatusResponseBody getBody() {
        return this.body;
    }

}
