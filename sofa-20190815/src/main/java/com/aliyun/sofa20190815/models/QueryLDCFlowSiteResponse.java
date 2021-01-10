// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCFlowSiteResponseBody body;

    public static QueryLDCFlowSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowSiteResponse self = new QueryLDCFlowSiteResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCFlowSiteResponse setBody(QueryLDCFlowSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCFlowSiteResponseBody getBody() {
        return this.body;
    }

}
