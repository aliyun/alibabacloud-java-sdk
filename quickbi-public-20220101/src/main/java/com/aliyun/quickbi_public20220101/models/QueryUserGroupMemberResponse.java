// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryUserGroupMemberResponse setBody(QueryUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
