// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckUmengInnerOuterCompleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUmengInnerOuterCompleteResponseBody body;

    public static CheckUmengInnerOuterCompleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUmengInnerOuterCompleteResponse self = new CheckUmengInnerOuterCompleteResponse();
        return TeaModel.build(map, self);
    }

    public CheckUmengInnerOuterCompleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUmengInnerOuterCompleteResponse setBody(CheckUmengInnerOuterCompleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUmengInnerOuterCompleteResponseBody getBody() {
        return this.body;
    }

}
