// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCredentialClientIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceCredentialClientIdResponseBody body;

    public static ListDeviceCredentialClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCredentialClientIdResponse self = new ListDeviceCredentialClientIdResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceCredentialClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceCredentialClientIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceCredentialClientIdResponse setBody(ListDeviceCredentialClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceCredentialClientIdResponseBody getBody() {
        return this.body;
    }

}
