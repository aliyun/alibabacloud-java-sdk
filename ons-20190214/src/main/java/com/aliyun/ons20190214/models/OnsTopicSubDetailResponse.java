// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicSubDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTopicSubDetailResponseBody body;

    public static OnsTopicSubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicSubDetailResponse self = new OnsTopicSubDetailResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicSubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicSubDetailResponse setBody(OnsTopicSubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicSubDetailResponseBody getBody() {
        return this.body;
    }

}
