// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddVodDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVodDomainResponse setBody(AddVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVodDomainResponseBody getBody() {
        return this.body;
    }

}
