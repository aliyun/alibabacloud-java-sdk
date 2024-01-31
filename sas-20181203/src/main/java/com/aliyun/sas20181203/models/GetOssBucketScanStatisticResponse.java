// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssBucketScanStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssBucketScanStatisticResponseBody body;

    public static GetOssBucketScanStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssBucketScanStatisticResponse self = new GetOssBucketScanStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetOssBucketScanStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssBucketScanStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssBucketScanStatisticResponse setBody(GetOssBucketScanStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssBucketScanStatisticResponseBody getBody() {
        return this.body;
    }

}
