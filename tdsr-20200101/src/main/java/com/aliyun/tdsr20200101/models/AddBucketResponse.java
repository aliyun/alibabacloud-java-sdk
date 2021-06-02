// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBucketResponseBody body;

    public static AddBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBucketResponse self = new AddBucketResponse();
        return TeaModel.build(map, self);
    }

    public AddBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBucketResponse setBody(AddBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBucketResponseBody getBody() {
        return this.body;
    }

}
