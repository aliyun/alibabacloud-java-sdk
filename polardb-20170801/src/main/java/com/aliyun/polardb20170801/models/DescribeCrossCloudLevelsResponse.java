// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudLevelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossCloudLevelsResponseBody body;

    public static DescribeCrossCloudLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudLevelsResponse self = new DescribeCrossCloudLevelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossCloudLevelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossCloudLevelsResponse setBody(DescribeCrossCloudLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossCloudLevelsResponseBody getBody() {
        return this.body;
    }

}
