// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountDeletionCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountDeletionCheckResultResponseBody body;

    public static GetAccountDeletionCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionCheckResultResponse self = new GetAccountDeletionCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountDeletionCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountDeletionCheckResultResponse setBody(GetAccountDeletionCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountDeletionCheckResultResponseBody getBody() {
        return this.body;
    }

}
