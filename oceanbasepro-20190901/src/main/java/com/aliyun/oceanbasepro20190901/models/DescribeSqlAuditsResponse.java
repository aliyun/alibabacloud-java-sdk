// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlAuditsResponseBody body;

    public static DescribeSqlAuditsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditsResponse self = new DescribeSqlAuditsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlAuditsResponse setBody(DescribeSqlAuditsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlAuditsResponseBody getBody() {
        return this.body;
    }

}
