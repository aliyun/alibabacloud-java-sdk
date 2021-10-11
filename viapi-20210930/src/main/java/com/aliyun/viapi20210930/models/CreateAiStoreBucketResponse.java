// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAiStoreBucketResponseBody body;

    public static CreateAiStoreBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreBucketResponse self = new CreateAiStoreBucketResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiStoreBucketResponse setBody(CreateAiStoreBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiStoreBucketResponseBody getBody() {
        return this.body;
    }

}
