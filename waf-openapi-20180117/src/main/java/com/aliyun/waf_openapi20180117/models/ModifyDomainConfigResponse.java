// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainConfigResponseBody body;

    public static ModifyDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainConfigResponse self = new ModifyDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainConfigResponse setBody(ModifyDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainConfigResponseBody getBody() {
        return this.body;
    }

}
