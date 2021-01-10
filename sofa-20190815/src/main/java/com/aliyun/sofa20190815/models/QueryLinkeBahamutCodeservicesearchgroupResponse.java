// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCodeservicesearchgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutCodeservicesearchgroupResponseBody body;

    public static QueryLinkeBahamutCodeservicesearchgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCodeservicesearchgroupResponse self = new QueryLinkeBahamutCodeservicesearchgroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCodeservicesearchgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutCodeservicesearchgroupResponse setBody(QueryLinkeBahamutCodeservicesearchgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutCodeservicesearchgroupResponseBody getBody() {
        return this.body;
    }

}
