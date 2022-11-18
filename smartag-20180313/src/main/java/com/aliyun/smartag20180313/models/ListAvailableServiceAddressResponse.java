// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableServiceAddressResponseBody body;

    public static ListAvailableServiceAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableServiceAddressResponse self = new ListAvailableServiceAddressResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableServiceAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableServiceAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableServiceAddressResponse setBody(ListAvailableServiceAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableServiceAddressResponseBody getBody() {
        return this.body;
    }

}
