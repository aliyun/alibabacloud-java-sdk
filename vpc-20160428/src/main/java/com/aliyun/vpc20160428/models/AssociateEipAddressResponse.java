// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateEipAddressResponseBody body;

    public static AssociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressResponse self = new AssociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateEipAddressResponse setBody(AssociateEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEipAddressResponseBody getBody() {
        return this.body;
    }

}
