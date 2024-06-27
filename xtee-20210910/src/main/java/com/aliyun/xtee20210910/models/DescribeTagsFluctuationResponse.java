// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsFluctuationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsFluctuationResponseBody body;

    public static DescribeTagsFluctuationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsFluctuationResponse self = new DescribeTagsFluctuationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsFluctuationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsFluctuationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsFluctuationResponse setBody(DescribeTagsFluctuationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsFluctuationResponseBody getBody() {
        return this.body;
    }

}
