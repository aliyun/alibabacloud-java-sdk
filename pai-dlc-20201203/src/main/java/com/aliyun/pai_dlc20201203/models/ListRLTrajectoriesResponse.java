// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLTrajectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRLTrajectoriesResponseBody body;

    public static ListRLTrajectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRLTrajectoriesResponse self = new ListRLTrajectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListRLTrajectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRLTrajectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRLTrajectoriesResponse setBody(ListRLTrajectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRLTrajectoriesResponseBody getBody() {
        return this.body;
    }

}
