// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityIpGroupResponseBody body;

    public static CreateSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIpGroupResponse self = new CreateSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityIpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityIpGroupResponse setBody(CreateSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
