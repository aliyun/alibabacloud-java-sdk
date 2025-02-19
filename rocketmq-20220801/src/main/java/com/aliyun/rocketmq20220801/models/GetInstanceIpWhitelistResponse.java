// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceIpWhitelistResponseBody body;

    public static GetInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhitelistResponse self = new GetInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceIpWhitelistResponse setBody(GetInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
