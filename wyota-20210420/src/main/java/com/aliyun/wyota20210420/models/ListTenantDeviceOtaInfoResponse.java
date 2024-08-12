// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTenantDeviceOtaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTenantDeviceOtaInfoResponseBody body;

    public static ListTenantDeviceOtaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantDeviceOtaInfoResponse self = new ListTenantDeviceOtaInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantDeviceOtaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantDeviceOtaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantDeviceOtaInfoResponse setBody(ListTenantDeviceOtaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantDeviceOtaInfoResponseBody getBody() {
        return this.body;
    }

}
