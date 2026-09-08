// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTotalSensitiveInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTotalSensitiveInfoResponseBody body;

    public static ListTotalSensitiveInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTotalSensitiveInfoResponse self = new ListTotalSensitiveInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListTotalSensitiveInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTotalSensitiveInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTotalSensitiveInfoResponse setBody(ListTotalSensitiveInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTotalSensitiveInfoResponseBody getBody() {
        return this.body;
    }

}
