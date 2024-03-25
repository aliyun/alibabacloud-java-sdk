// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateByCaSnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceCertificateByCaSnResponseBody body;

    public static ListDeviceCertificateByCaSnResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCertificateByCaSnResponse self = new ListDeviceCertificateByCaSnResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceCertificateByCaSnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceCertificateByCaSnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceCertificateByCaSnResponse setBody(ListDeviceCertificateByCaSnResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceCertificateByCaSnResponseBody getBody() {
        return this.body;
    }

}
