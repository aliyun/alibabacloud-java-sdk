// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventDetailResponseBody body;

    public static DescribeSuspEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailResponse self = new DescribeSuspEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventDetailResponse setBody(DescribeSuspEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventDetailResponseBody getBody() {
        return this.body;
    }

}
