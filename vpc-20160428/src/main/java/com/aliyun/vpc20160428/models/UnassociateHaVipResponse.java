// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateHaVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassociateHaVipResponseBody body;

    public static UnassociateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateHaVipResponse self = new UnassociateHaVipResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateHaVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateHaVipResponse setBody(UnassociateHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateHaVipResponseBody getBody() {
        return this.body;
    }

}
