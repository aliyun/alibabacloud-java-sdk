// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDNSRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainDNSRecordResponseBody body;

    public static DescribeDomainDNSRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDNSRecordResponse self = new DescribeDomainDNSRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDNSRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainDNSRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainDNSRecordResponse setBody(DescribeDomainDNSRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDNSRecordResponseBody getBody() {
        return this.body;
    }

}
