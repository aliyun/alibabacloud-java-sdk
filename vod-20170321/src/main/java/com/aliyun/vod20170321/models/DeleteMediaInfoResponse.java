// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMediaInfoResponseBody body;

    public static DeleteMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfoResponse self = new DeleteMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaInfoResponse setBody(DeleteMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaInfoResponseBody getBody() {
        return this.body;
    }

}
