// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantcookieResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutTenantcookieResponseBody body;

    public static SetLinkeBahamutTenantcookieResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantcookieResponse self = new SetLinkeBahamutTenantcookieResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantcookieResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutTenantcookieResponse setBody(SetLinkeBahamutTenantcookieResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutTenantcookieResponseBody getBody() {
        return this.body;
    }

}
