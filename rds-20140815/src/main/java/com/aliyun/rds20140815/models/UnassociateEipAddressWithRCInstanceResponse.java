// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressWithRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassociateEipAddressWithRCInstanceResponseBody body;

    public static UnassociateEipAddressWithRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressWithRCInstanceResponse self = new UnassociateEipAddressWithRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressWithRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateEipAddressWithRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassociateEipAddressWithRCInstanceResponse setBody(UnassociateEipAddressWithRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateEipAddressWithRCInstanceResponseBody getBody() {
        return this.body;
    }

}
