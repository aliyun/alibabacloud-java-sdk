// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenantapplevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutCloudtenantapplevelResponseBody body;

    public static QueryLinkeBahamutCloudtenantapplevelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenantapplevelResponse self = new QueryLinkeBahamutCloudtenantapplevelResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenantapplevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponse setBody(QueryLinkeBahamutCloudtenantapplevelResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutCloudtenantapplevelResponseBody getBody() {
        return this.body;
    }

}
