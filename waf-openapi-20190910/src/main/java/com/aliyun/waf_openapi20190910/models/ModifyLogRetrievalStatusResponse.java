// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogRetrievalStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyLogRetrievalStatusResponse setBody(ModifyLogRetrievalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogRetrievalStatusResponseBody getBody() {
        return this.body;
    }

}
