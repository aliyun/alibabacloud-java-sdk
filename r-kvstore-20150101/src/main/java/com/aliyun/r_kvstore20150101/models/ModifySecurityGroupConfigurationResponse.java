// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityGroupConfigurationResponseBody body;

    public static ModifySecurityGroupConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponse self = new ModifySecurityGroupConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupConfigurationResponse setBody(ModifySecurityGroupConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupConfigurationResponseBody getBody() {
        return this.body;
    }

}
