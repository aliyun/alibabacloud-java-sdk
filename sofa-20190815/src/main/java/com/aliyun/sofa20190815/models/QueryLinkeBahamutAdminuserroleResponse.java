// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminuserroleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAdminuserroleResponseBody body;

    public static QueryLinkeBahamutAdminuserroleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminuserroleResponse self = new QueryLinkeBahamutAdminuserroleResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminuserroleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAdminuserroleResponse setBody(QueryLinkeBahamutAdminuserroleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAdminuserroleResponseBody getBody() {
        return this.body;
    }

}
