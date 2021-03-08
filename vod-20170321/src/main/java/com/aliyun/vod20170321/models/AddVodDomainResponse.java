// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVodDomainResponseBody body;

    public static AddVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVodDomainResponse self = new AddVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVodDomainResponse setBody(AddVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVodDomainResponseBody getBody() {
        return this.body;
    }

}
