// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminiterationtemplateidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAdminiterationtemplateidResponseBody body;

    public static QueryLinkeBahamutAdminiterationtemplateidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminiterationtemplateidResponse self = new QueryLinkeBahamutAdminiterationtemplateidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponse setBody(QueryLinkeBahamutAdminiterationtemplateidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAdminiterationtemplateidResponseBody getBody() {
        return this.body;
    }

}
