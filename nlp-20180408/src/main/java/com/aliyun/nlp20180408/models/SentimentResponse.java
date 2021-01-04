// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp20180408.models;

import com.aliyun.tea.*;

public class SentimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static SentimentResponse build(java.util.Map<String, ?> map) throws Exception {
        SentimentResponse self = new SentimentResponse();
        return TeaModel.build(map, self);
    }

    public SentimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
