// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVodDomainResponseBody body;

    public static DeleteVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodDomainResponse self = new DeleteVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodDomainResponse setBody(DeleteVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodDomainResponseBody getBody() {
        return this.body;
    }

}
