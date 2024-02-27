// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupListByParentIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserGroupListByParentIdResponseBody body;

    public static QueryUserGroupListByParentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupListByParentIdResponse self = new QueryUserGroupListByParentIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupListByParentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserGroupListByParentIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserGroupListByParentIdResponse setBody(QueryUserGroupListByParentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserGroupListByParentIdResponseBody getBody() {
        return this.body;
    }

}
