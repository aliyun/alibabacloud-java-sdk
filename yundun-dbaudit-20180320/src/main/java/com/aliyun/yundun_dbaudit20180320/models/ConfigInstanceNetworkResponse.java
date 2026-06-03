// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ConfigInstanceNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ConfigInstanceNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigInstanceNetworkResponse setBody(ConfigInstanceNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceNetworkResponseBody getBody() {
        return this.body;
    }

}
