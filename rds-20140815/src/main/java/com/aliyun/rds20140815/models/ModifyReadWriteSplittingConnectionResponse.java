// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReadWriteSplittingConnectionResponseBody body;

    public static ModifyReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadWriteSplittingConnectionResponse self = new ModifyReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReadWriteSplittingConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReadWriteSplittingConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReadWriteSplittingConnectionResponse setBody(ModifyReadWriteSplittingConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

}
