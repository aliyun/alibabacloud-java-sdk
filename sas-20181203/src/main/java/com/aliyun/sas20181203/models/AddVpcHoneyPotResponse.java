// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVpcHoneyPotResponseBody body;

    public static AddVpcHoneyPotResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVpcHoneyPotResponse self = new AddVpcHoneyPotResponse();
        return TeaModel.build(map, self);
    }

    public AddVpcHoneyPotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVpcHoneyPotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVpcHoneyPotResponse setBody(AddVpcHoneyPotResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

}
