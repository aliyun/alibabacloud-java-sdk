// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDBTenantResponseBody body;

    public static DeleteAgenticDBTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBTenantResponse self = new DeleteAgenticDBTenantResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDBTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDBTenantResponse setBody(DeleteAgenticDBTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDBTenantResponseBody getBody() {
        return this.body;
    }

}
