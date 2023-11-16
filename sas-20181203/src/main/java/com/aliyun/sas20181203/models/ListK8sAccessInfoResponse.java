// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListK8sAccessInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListK8sAccessInfoResponseBody body;

    public static ListK8sAccessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sAccessInfoResponse self = new ListK8sAccessInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sAccessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sAccessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sAccessInfoResponse setBody(ListK8sAccessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sAccessInfoResponseBody getBody() {
        return this.body;
    }

}
