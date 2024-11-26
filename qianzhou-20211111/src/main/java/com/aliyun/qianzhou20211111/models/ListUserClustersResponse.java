// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListUserClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserClustersResponseBody body;

    public static ListUserClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserClustersResponse self = new ListUserClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListUserClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserClustersResponse setBody(ListUserClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserClustersResponseBody getBody() {
        return this.body;
    }

}
