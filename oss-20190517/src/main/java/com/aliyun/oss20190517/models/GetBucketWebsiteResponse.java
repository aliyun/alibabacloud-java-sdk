// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketWebsiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketWebsiteResponseBody body;

    public static GetBucketWebsiteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketWebsiteResponse self = new GetBucketWebsiteResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketWebsiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketWebsiteResponse setBody(GetBucketWebsiteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketWebsiteResponseBody getBody() {
        return this.body;
    }

}
