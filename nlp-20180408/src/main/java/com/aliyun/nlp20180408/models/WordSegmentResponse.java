// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp20180408.models;

import com.aliyun.tea.*;

public class WordSegmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static WordSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        WordSegmentResponse self = new WordSegmentResponse();
        return TeaModel.build(map, self);
    }

    public WordSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
