// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class LabelPartnerUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public LabelPartnerUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LabelPartnerUserResponse setBody(LabelPartnerUserResponseBody body) {
        this.body = body;
        return this;
    }
    public LabelPartnerUserResponseBody getBody() {
        return this.body;
    }

}
