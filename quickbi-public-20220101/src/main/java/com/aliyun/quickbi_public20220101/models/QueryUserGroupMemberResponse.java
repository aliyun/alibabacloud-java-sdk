// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserGroupMemberResponseBody body;

    public static QueryUserGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupMemberResponse self = new QueryUserGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserGroupMemberResponse setBody(QueryUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
