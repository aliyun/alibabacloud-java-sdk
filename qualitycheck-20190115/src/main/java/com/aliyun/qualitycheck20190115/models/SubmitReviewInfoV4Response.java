// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitReviewInfoV4ResponseBody body;

    public static SubmitReviewInfoV4Response build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoV4Response self = new SubmitReviewInfoV4Response();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitReviewInfoV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitReviewInfoV4Response setBody(SubmitReviewInfoV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitReviewInfoV4ResponseBody getBody() {
        return this.body;
    }

}
