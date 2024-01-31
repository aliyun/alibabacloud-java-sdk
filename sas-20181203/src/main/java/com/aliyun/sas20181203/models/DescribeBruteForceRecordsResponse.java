// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBruteForceRecordsResponseBody body;

    public static DescribeBruteForceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBruteForceRecordsResponse self = new DescribeBruteForceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBruteForceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBruteForceRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBruteForceRecordsResponse setBody(DescribeBruteForceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBruteForceRecordsResponseBody getBody() {
        return this.body;
    }

}
