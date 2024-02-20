// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMajorProtectionBlackIpsResponseBody body;

    public static DescribeMajorProtectionBlackIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorProtectionBlackIpsResponse self = new DescribeMajorProtectionBlackIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMajorProtectionBlackIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMajorProtectionBlackIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMajorProtectionBlackIpsResponse setBody(DescribeMajorProtectionBlackIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMajorProtectionBlackIpsResponseBody getBody() {
        return this.body;
    }

}
