// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdmintesttemplatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAdmintesttemplatResponseBody body;

    public static QueryLinkeBahamutAdmintesttemplatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdmintesttemplatResponse self = new QueryLinkeBahamutAdmintesttemplatResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdmintesttemplatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAdmintesttemplatResponse setBody(QueryLinkeBahamutAdmintesttemplatResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAdmintesttemplatResponseBody getBody() {
        return this.body;
    }

}
