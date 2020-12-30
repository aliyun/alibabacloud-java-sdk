// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpnCertificateAssociationsResponseBody body;

    public static ListVpnCertificateAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpnCertificateAssociationsResponse self = new ListVpnCertificateAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpnCertificateAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpnCertificateAssociationsResponse setBody(ListVpnCertificateAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpnCertificateAssociationsResponseBody getBody() {
        return this.body;
    }

}
