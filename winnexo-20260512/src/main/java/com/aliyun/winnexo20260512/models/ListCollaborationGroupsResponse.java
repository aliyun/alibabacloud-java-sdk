// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCollaborationGroupsResponseBody body;

    public static ListCollaborationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupsResponse self = new ListCollaborationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCollaborationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCollaborationGroupsResponse setBody(ListCollaborationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCollaborationGroupsResponseBody getBody() {
        return this.body;
    }

}
