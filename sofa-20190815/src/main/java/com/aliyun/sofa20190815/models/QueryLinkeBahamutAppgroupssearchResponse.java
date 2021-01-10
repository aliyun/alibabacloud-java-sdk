// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppgroupssearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppgroupssearchResponseBody body;

    public static QueryLinkeBahamutAppgroupssearchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppgroupssearchResponse self = new QueryLinkeBahamutAppgroupssearchResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppgroupssearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppgroupssearchResponse setBody(QueryLinkeBahamutAppgroupssearchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppgroupssearchResponseBody getBody() {
        return this.body;
    }

}
