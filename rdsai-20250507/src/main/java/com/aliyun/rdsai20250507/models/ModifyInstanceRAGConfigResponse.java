// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceRAGConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceRAGConfigResponseBody body;

    public static ModifyInstanceRAGConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRAGConfigResponse self = new ModifyInstanceRAGConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRAGConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceRAGConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceRAGConfigResponse setBody(ModifyInstanceRAGConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceRAGConfigResponseBody getBody() {
        return this.body;
    }

}
