// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutTenantResponseBody body;

    public static SetLinkeBahamutTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantResponse self = new SetLinkeBahamutTenantResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutTenantResponse setBody(SetLinkeBahamutTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutTenantResponseBody getBody() {
        return this.body;
    }

}
