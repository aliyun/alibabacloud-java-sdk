// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpcHoneyPotResponseBody body;

    public static DeleteVpcHoneyPotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcHoneyPotResponse self = new DeleteVpcHoneyPotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcHoneyPotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcHoneyPotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcHoneyPotResponse setBody(DeleteVpcHoneyPotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

}
