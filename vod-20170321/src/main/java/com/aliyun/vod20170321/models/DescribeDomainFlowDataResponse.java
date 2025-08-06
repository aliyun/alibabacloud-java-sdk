// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeDomainFlowDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainFlowDataResponseBody body;

    public static DescribeDomainFlowDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainFlowDataResponse self = new DescribeDomainFlowDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainFlowDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainFlowDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainFlowDataResponse setBody(DescribeDomainFlowDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainFlowDataResponseBody getBody() {
        return this.body;
    }

}
