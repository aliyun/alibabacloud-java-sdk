// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleDataPageResponseBody body;

    public static DescribeSampleDataPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataPageResponse self = new DescribeSampleDataPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleDataPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleDataPageResponse setBody(DescribeSampleDataPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleDataPageResponseBody getBody() {
        return this.body;
    }

}
