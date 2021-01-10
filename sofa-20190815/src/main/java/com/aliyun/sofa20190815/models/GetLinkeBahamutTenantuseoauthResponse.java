// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantuseoauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutTenantuseoauthResponseBody body;

    public static GetLinkeBahamutTenantuseoauthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantuseoauthResponse self = new GetLinkeBahamutTenantuseoauthResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantuseoauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutTenantuseoauthResponse setBody(GetLinkeBahamutTenantuseoauthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutTenantuseoauthResponseBody getBody() {
        return this.body;
    }

}
