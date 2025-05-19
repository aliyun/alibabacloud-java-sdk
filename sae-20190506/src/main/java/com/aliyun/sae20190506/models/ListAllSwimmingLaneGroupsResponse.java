// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLaneGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllSwimmingLaneGroupsResponseBody body;

    public static ListAllSwimmingLaneGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLaneGroupsResponse self = new ListAllSwimmingLaneGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLaneGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllSwimmingLaneGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllSwimmingLaneGroupsResponse setBody(ListAllSwimmingLaneGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllSwimmingLaneGroupsResponseBody getBody() {
        return this.body;
    }

}
