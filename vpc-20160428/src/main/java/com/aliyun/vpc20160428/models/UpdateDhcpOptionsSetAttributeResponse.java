// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDhcpOptionsSetAttributeResponseBody body;

    public static UpdateDhcpOptionsSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeResponse self = new UpdateDhcpOptionsSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDhcpOptionsSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDhcpOptionsSetAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDhcpOptionsSetAttributeResponse setBody(UpdateDhcpOptionsSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDhcpOptionsSetAttributeResponseBody getBody() {
        return this.body;
    }

}
