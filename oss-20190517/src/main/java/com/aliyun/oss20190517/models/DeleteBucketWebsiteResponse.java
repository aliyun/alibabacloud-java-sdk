// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteBucketWebsiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteBucketWebsiteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketWebsiteResponse self = new DeleteBucketWebsiteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketWebsiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
