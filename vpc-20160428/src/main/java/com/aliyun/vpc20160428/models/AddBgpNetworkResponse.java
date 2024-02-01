// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBgpNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBgpNetworkResponseBody body;

    public static AddBgpNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBgpNetworkResponse self = new AddBgpNetworkResponse();
        return TeaModel.build(map, self);
    }

    public AddBgpNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBgpNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBgpNetworkResponse setBody(AddBgpNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBgpNetworkResponseBody getBody() {
        return this.body;
    }

}
