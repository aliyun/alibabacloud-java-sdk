// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckTenantBizResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckTenantBizResponseBody body;

    public static CheckTenantBizResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTenantBizResponse self = new CheckTenantBizResponse();
        return TeaModel.build(map, self);
    }

    public CheckTenantBizResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTenantBizResponse setBody(CheckTenantBizResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTenantBizResponseBody getBody() {
        return this.body;
    }

}
