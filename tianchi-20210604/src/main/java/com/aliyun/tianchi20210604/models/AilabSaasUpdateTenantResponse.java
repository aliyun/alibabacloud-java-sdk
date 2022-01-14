// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tianchi20210604.models;

import com.aliyun.tea.*;

public class AilabSaasUpdateTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AilabSaasUpdateTenantResponseBody body;

    public static AilabSaasUpdateTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        AilabSaasUpdateTenantResponse self = new AilabSaasUpdateTenantResponse();
        return TeaModel.build(map, self);
    }

    public AilabSaasUpdateTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AilabSaasUpdateTenantResponse setBody(AilabSaasUpdateTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public AilabSaasUpdateTenantResponseBody getBody() {
        return this.body;
    }

}
