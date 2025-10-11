// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionMappingToAliyunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossCloudRegionMappingToAliyunResponseBody body;

    public static DescribeCrossCloudRegionMappingToAliyunResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionMappingToAliyunResponse self = new DescribeCrossCloudRegionMappingToAliyunResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionMappingToAliyunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossCloudRegionMappingToAliyunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossCloudRegionMappingToAliyunResponse setBody(DescribeCrossCloudRegionMappingToAliyunResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossCloudRegionMappingToAliyunResponseBody getBody() {
        return this.body;
    }

}
