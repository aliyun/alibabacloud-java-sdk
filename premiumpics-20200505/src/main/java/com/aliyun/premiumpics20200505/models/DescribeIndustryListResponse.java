// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeIndustryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIndustryListResponseBody body;

    public static DescribeIndustryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndustryListResponse self = new DescribeIndustryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIndustryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIndustryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIndustryListResponse setBody(DescribeIndustryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIndustryListResponseBody getBody() {
        return this.body;
    }

}
