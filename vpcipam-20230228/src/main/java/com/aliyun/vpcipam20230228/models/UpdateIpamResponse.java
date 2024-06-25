// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpamResponseBody body;

    public static UpdateIpamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamResponse self = new UpdateIpamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpamResponse setBody(UpdateIpamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpamResponseBody getBody() {
        return this.body;
    }

}
