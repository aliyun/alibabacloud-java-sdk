// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteVpcHoneyPotResponse setBody(DeleteVpcHoneyPotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

}
