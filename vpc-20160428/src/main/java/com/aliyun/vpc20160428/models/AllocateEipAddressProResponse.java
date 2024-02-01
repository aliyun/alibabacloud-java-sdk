// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateEipAddressProResponseBody body;

    public static AllocateEipAddressProResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressProResponse self = new AllocateEipAddressProResponse();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateEipAddressProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateEipAddressProResponse setBody(AllocateEipAddressProResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateEipAddressProResponseBody getBody() {
        return this.body;
    }

}
