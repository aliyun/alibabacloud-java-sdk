// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleBatchOssPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleBatchOssPolicyResponseBody body;

    public static DescribeSampleBatchOssPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleBatchOssPolicyResponse self = new DescribeSampleBatchOssPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleBatchOssPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleBatchOssPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleBatchOssPolicyResponse setBody(DescribeSampleBatchOssPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleBatchOssPolicyResponseBody getBody() {
        return this.body;
    }

}
