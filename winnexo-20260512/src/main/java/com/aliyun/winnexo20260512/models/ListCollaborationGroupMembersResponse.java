// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCollaborationGroupMembersResponseBody body;

    public static ListCollaborationGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupMembersResponse self = new ListCollaborationGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCollaborationGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCollaborationGroupMembersResponse setBody(ListCollaborationGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCollaborationGroupMembersResponseBody getBody() {
        return this.body;
    }

}
