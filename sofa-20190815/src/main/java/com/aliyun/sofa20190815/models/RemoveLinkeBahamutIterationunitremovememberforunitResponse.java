// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutIterationunitremovememberforunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeBahamutIterationunitremovememberforunitResponseBody body;

    public static RemoveLinkeBahamutIterationunitremovememberforunitResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutIterationunitremovememberforunitResponse self = new RemoveLinkeBahamutIterationunitremovememberforunitResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutIterationunitremovememberforunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeBahamutIterationunitremovememberforunitResponse setBody(RemoveLinkeBahamutIterationunitremovememberforunitResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeBahamutIterationunitremovememberforunitResponseBody getBody() {
        return this.body;
    }

}
