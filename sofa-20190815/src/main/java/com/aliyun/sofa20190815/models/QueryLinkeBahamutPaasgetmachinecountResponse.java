// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasgetmachinecountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPaasgetmachinecountResponseBody body;

    public static QueryLinkeBahamutPaasgetmachinecountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasgetmachinecountResponse self = new QueryLinkeBahamutPaasgetmachinecountResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasgetmachinecountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPaasgetmachinecountResponse setBody(QueryLinkeBahamutPaasgetmachinecountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPaasgetmachinecountResponseBody getBody() {
        return this.body;
    }

}
