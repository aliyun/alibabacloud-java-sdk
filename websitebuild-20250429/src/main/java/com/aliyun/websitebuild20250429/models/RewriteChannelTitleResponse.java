// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RewriteChannelTitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RewriteChannelTitleResponseBody body;

    public static RewriteChannelTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        RewriteChannelTitleResponse self = new RewriteChannelTitleResponse();
        return TeaModel.build(map, self);
    }

    public RewriteChannelTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RewriteChannelTitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RewriteChannelTitleResponse setBody(RewriteChannelTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public RewriteChannelTitleResponseBody getBody() {
        return this.body;
    }

}
