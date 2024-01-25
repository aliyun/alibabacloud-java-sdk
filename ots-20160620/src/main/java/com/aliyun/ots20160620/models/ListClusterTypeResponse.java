// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListClusterTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterTypeResponseBody body;

    public static ListClusterTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypeResponse self = new ListClusterTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterTypeResponse setBody(ListClusterTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterTypeResponseBody getBody() {
        return this.body;
    }

}
