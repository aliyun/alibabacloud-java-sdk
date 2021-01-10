// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelThesaurusForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DelThesaurusForApiResponse setBody(DelThesaurusForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DelThesaurusForApiResponseBody getBody() {
        return this.body;
    }

}
