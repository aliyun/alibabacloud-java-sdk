// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateQosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisassociateQosResponseBody body;

    public static DisassociateQosResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateQosResponse self = new DisassociateQosResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateQosResponse setBody(DisassociateQosResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateQosResponseBody getBody() {
        return this.body;
    }

}
