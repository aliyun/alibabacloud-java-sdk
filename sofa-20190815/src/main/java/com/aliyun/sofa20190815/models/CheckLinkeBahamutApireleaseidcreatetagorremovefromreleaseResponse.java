// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponseBody body;

    public static CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse self = new CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponse setBody(CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutApireleaseidcreatetagorremovefromreleaseResponseBody getBody() {
        return this.body;
    }

}
