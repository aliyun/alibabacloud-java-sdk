// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutIterationremovememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeBahamutIterationremovememberResponseBody body;

    public static RemoveLinkeBahamutIterationremovememberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutIterationremovememberResponse self = new RemoveLinkeBahamutIterationremovememberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutIterationremovememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeBahamutIterationremovememberResponse setBody(RemoveLinkeBahamutIterationremovememberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeBahamutIterationremovememberResponseBody getBody() {
        return this.body;
    }

}
