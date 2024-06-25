// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpamPoolResponseBody body;

    public static UpdateIpamPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolResponse self = new UpdateIpamPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpamPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpamPoolResponse setBody(UpdateIpamPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpamPoolResponseBody getBody() {
        return this.body;
    }

}
