// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLinkeBahamutReviewResponseBody body;

    public static SetLinkeBahamutReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutReviewResponse self = new SetLinkeBahamutReviewResponse();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLinkeBahamutReviewResponse setBody(SetLinkeBahamutReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLinkeBahamutReviewResponseBody getBody() {
        return this.body;
    }

}
