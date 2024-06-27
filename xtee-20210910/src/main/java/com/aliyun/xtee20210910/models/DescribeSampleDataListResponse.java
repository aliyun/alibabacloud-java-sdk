// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleDataListResponseBody body;

    public static DescribeSampleDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataListResponse self = new DescribeSampleDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleDataListResponse setBody(DescribeSampleDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleDataListResponseBody getBody() {
        return this.body;
    }

}
