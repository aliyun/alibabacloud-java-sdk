// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class LabelPartnerUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LabelPartnerUserResponseBody body;

    public static LabelPartnerUserResponse build(java.util.Map<String, ?> map) throws Exception {
        LabelPartnerUserResponse self = new LabelPartnerUserResponse();
        return TeaModel.build(map, self);
    }

    public LabelPartnerUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LabelPartnerUserResponse setBody(LabelPartnerUserResponseBody body) {
        this.body = body;
        return this;
    }
    public LabelPartnerUserResponseBody getBody() {
        return this.body;
    }

}
