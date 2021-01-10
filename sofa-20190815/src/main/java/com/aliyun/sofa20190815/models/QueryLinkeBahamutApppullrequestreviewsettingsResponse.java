// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutApppullrequestreviewsettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody body;

    public static QueryLinkeBahamutApppullrequestreviewsettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutApppullrequestreviewsettingsResponse self = new QueryLinkeBahamutApppullrequestreviewsettingsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponse setBody(QueryLinkeBahamutApppullrequestreviewsettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody getBody() {
        return this.body;
    }

}
