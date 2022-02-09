// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserNameBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantUserNameBlacklistResponseBody body;

    public static DescribeTenantUserNameBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserNameBlacklistResponse self = new DescribeTenantUserNameBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserNameBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantUserNameBlacklistResponse setBody(DescribeTenantUserNameBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantUserNameBlacklistResponseBody getBody() {
        return this.body;
    }

}
