// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainDetailResponseBody body;

    public static DescribeDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailResponse self = new DescribeDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainDetailResponse setBody(DescribeDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDetailResponseBody getBody() {
        return this.body;
    }

}
