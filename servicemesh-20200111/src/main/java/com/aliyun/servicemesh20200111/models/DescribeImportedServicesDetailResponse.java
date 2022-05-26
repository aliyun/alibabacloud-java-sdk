// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeImportedServicesDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImportedServicesDetailResponseBody body;

    public static DescribeImportedServicesDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedServicesDetailResponse self = new DescribeImportedServicesDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportedServicesDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportedServicesDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportedServicesDetailResponse setBody(DescribeImportedServicesDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportedServicesDetailResponseBody getBody() {
        return this.body;
    }

}
