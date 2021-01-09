// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfigInstanceSecurityGroupsResponseBody body;

    public static ConfigInstanceSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceSecurityGroupsResponse self = new ConfigInstanceSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceSecurityGroupsResponse setBody(ConfigInstanceSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
