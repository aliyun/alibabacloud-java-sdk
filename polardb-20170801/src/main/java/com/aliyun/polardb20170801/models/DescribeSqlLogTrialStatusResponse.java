// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTrialStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlLogTrialStatusResponseBody body;

    public static DescribeSqlLogTrialStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTrialStatusResponse self = new DescribeSqlLogTrialStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTrialStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogTrialStatusResponse setBody(DescribeSqlLogTrialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogTrialStatusResponseBody getBody() {
        return this.body;
    }

}
