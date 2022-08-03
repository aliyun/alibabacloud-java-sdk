// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceDirectoryAccountResponseBody body;

    public static GetResourceDirectoryAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryAccountResponse self = new GetResourceDirectoryAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceDirectoryAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceDirectoryAccountResponse setBody(GetResourceDirectoryAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceDirectoryAccountResponseBody getBody() {
        return this.body;
    }

}
