// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetEnterpriseDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Developer body;

    public static GetEnterpriseDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDeveloperResponse self = new GetEnterpriseDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDeveloperResponse setBody(Developer body) {
        this.body = body;
        return this;
    }
    public Developer getBody() {
        return this.body;
    }

}
