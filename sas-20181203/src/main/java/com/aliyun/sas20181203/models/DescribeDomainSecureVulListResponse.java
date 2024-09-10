// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureVulListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureVulListResponseBody body;

    public static DescribeDomainSecureVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureVulListResponse self = new DescribeDomainSecureVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureVulListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureVulListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureVulListResponse setBody(DescribeDomainSecureVulListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureVulListResponseBody getBody() {
        return this.body;
    }

}
