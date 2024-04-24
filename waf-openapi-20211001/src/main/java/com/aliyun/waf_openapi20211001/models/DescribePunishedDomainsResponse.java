// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePunishedDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePunishedDomainsResponseBody body;

    public static DescribePunishedDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePunishedDomainsResponse self = new DescribePunishedDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePunishedDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePunishedDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePunishedDomainsResponse setBody(DescribePunishedDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePunishedDomainsResponseBody getBody() {
        return this.body;
    }

}
