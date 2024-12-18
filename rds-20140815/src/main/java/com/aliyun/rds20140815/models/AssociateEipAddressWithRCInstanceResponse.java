// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AssociateEipAddressWithRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateEipAddressWithRCInstanceResponseBody body;

    public static AssociateEipAddressWithRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressWithRCInstanceResponse self = new AssociateEipAddressWithRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressWithRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateEipAddressWithRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateEipAddressWithRCInstanceResponse setBody(AssociateEipAddressWithRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEipAddressWithRCInstanceResponseBody getBody() {
        return this.body;
    }

}
