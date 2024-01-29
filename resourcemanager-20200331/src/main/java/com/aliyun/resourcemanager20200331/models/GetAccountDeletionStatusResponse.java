// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountDeletionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountDeletionStatusResponseBody body;

    public static GetAccountDeletionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionStatusResponse self = new GetAccountDeletionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountDeletionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountDeletionStatusResponse setBody(GetAccountDeletionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountDeletionStatusResponseBody getBody() {
        return this.body;
    }

}
