// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAffectedMaliciousFileImagesResponseBody body;

    public static DescribeAffectedMaliciousFileImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedMaliciousFileImagesResponse self = new DescribeAffectedMaliciousFileImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedMaliciousFileImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAffectedMaliciousFileImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAffectedMaliciousFileImagesResponse setBody(DescribeAffectedMaliciousFileImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAffectedMaliciousFileImagesResponseBody getBody() {
        return this.body;
    }

}
