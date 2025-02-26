// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesWithEcsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesWithEcsInfoResponseBody body;

    public static ListInstancesWithEcsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesWithEcsInfoResponse self = new ListInstancesWithEcsInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesWithEcsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesWithEcsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesWithEcsInfoResponse setBody(ListInstancesWithEcsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesWithEcsInfoResponseBody getBody() {
        return this.body;
    }

}
