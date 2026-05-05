// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditUsageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreditUsageInfoResponseBody body;

    public static DescribeCreditUsageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditUsageInfoResponse self = new DescribeCreditUsageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreditUsageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreditUsageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreditUsageInfoResponse setBody(DescribeCreditUsageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreditUsageInfoResponseBody getBody() {
        return this.body;
    }

}
