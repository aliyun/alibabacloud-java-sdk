// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateQosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateQosResponseBody body;

    public static AssociateQosResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateQosResponse self = new AssociateQosResponse();
        return TeaModel.build(map, self);
    }

    public AssociateQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateQosResponse setBody(AssociateQosResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateQosResponseBody getBody() {
        return this.body;
    }

}
