// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigInstanceWhiteListResponseBody body;

    public static ConfigInstanceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhiteListResponse self = new ConfigInstanceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigInstanceWhiteListResponse setBody(ConfigInstanceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceWhiteListResponseBody getBody() {
        return this.body;
    }

}
