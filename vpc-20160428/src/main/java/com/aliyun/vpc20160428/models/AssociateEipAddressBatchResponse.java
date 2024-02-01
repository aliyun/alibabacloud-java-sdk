// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateEipAddressBatchResponseBody body;

    public static AssociateEipAddressBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressBatchResponse self = new AssociateEipAddressBatchResponse();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateEipAddressBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateEipAddressBatchResponse setBody(AssociateEipAddressBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateEipAddressBatchResponseBody getBody() {
        return this.body;
    }

}
