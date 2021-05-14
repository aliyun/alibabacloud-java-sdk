// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddVpcHoneyPotResponse setBody(AddVpcHoneyPotResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

}
