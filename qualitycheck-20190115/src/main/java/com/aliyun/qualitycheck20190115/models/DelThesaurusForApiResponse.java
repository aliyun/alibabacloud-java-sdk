// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelThesaurusForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelThesaurusForApiResponseBody body;

    public static DelThesaurusForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DelThesaurusForApiResponse self = new DelThesaurusForApiResponse();
        return TeaModel.build(map, self);
    }

    public DelThesaurusForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelThesaurusForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelThesaurusForApiResponse setBody(DelThesaurusForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DelThesaurusForApiResponseBody getBody() {
        return this.body;
    }

}
