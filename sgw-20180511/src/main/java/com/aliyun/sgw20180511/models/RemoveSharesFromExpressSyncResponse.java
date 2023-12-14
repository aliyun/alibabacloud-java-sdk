// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RemoveSharesFromExpressSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSharesFromExpressSyncResponseBody body;

    public static RemoveSharesFromExpressSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharesFromExpressSyncResponse self = new RemoveSharesFromExpressSyncResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSharesFromExpressSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSharesFromExpressSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSharesFromExpressSyncResponse setBody(RemoveSharesFromExpressSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSharesFromExpressSyncResponseBody getBody() {
        return this.body;
    }

}
