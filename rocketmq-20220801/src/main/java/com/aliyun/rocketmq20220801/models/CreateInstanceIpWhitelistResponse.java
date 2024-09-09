// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceIpWhitelistResponseBody body;

    public static CreateInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceIpWhitelistResponse self = new CreateInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceIpWhitelistResponse setBody(CreateInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
