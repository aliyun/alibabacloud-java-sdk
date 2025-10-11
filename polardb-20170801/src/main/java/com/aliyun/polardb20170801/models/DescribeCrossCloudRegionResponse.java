// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossCloudRegionResponseBody body;

    public static DescribeCrossCloudRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionResponse self = new DescribeCrossCloudRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossCloudRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossCloudRegionResponse setBody(DescribeCrossCloudRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossCloudRegionResponseBody getBody() {
        return this.body;
    }

}
