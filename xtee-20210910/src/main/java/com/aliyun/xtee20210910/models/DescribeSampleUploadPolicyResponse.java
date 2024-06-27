// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleUploadPolicyResponseBody body;

    public static DescribeSampleUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleUploadPolicyResponse self = new DescribeSampleUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleUploadPolicyResponse setBody(DescribeSampleUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
