// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifySpecTypePreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySpecTypePreCheckResponseBody body;

    public static ModifySpecTypePreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySpecTypePreCheckResponse self = new ModifySpecTypePreCheckResponse();
        return TeaModel.build(map, self);
    }

    public ModifySpecTypePreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySpecTypePreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySpecTypePreCheckResponse setBody(ModifySpecTypePreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySpecTypePreCheckResponseBody getBody() {
        return this.body;
    }

}
