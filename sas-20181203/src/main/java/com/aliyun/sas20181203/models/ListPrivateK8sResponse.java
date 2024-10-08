// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPrivateK8sResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateK8sResponseBody body;

    public static ListPrivateK8sResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateK8sResponse self = new ListPrivateK8sResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateK8sResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateK8sResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateK8sResponse setBody(ListPrivateK8sResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateK8sResponseBody getBody() {
        return this.body;
    }

}
