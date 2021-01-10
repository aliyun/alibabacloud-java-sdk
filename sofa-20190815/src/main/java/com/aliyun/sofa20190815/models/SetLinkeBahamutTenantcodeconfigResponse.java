// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutTenantcodeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutTenantcodeconfigResponseBody body;

    public static SetLinkeBahamutTenantcodeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutTenantcodeconfigResponse self = new SetLinkeBahamutTenantcodeconfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutTenantcodeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutTenantcodeconfigResponse setBody(SetLinkeBahamutTenantcodeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutTenantcodeconfigResponseBody getBody() {
        return this.body;
    }

}
