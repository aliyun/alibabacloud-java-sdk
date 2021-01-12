// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBInstanceProxyConfigurationResponseBody body;

    public static ModifyDBInstanceProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationResponse self = new ModifyDBInstanceProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceProxyConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceProxyConfigurationResponse setBody(ModifyDBInstanceProxyConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceProxyConfigurationResponseBody getBody() {
        return this.body;
    }

}
