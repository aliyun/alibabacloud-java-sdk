// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinklogRegexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeLinklogRegexResponseBody body;

    public static CheckLinkeLinklogRegexResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinklogRegexResponse self = new CheckLinkeLinklogRegexResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinklogRegexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeLinklogRegexResponse setBody(CheckLinkeLinklogRegexResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeLinklogRegexResponseBody getBody() {
        return this.body;
    }

}
