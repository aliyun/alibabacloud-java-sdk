// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteObjectTaggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteObjectTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectTaggingResponse self = new DeleteObjectTaggingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteObjectTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
