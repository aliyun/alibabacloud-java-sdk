// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateHaVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateHaVipResponseBody body;

    public static AssociateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateHaVipResponse self = new AssociateHaVipResponse();
        return TeaModel.build(map, self);
    }

    public AssociateHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateHaVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateHaVipResponse setBody(AssociateHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateHaVipResponseBody getBody() {
        return this.body;
    }

}
