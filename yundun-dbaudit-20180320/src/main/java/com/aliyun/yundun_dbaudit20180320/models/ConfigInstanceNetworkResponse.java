// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ConfigInstanceNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigInstanceNetworkResponseBody body;

    public static ConfigInstanceNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceNetworkResponse self = new ConfigInstanceNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceNetworkResponse setBody(ConfigInstanceNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceNetworkResponseBody getBody() {
        return this.body;
    }

}
