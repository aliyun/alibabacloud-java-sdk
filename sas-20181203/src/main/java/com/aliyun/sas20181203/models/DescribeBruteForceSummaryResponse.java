// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBruteForceSummaryResponseBody body;

    public static DescribeBruteForceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBruteForceSummaryResponse self = new DescribeBruteForceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBruteForceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBruteForceSummaryResponse setBody(DescribeBruteForceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBruteForceSummaryResponseBody getBody() {
        return this.body;
    }

}
