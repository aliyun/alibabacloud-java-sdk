// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutIterationremoveunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeBahamutIterationremoveunitResponseBody body;

    public static RemoveLinkeBahamutIterationremoveunitResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutIterationremoveunitResponse self = new RemoveLinkeBahamutIterationremoveunitResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutIterationremoveunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeBahamutIterationremoveunitResponse setBody(RemoveLinkeBahamutIterationremoveunitResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeBahamutIterationremoveunitResponseBody getBody() {
        return this.body;
    }

}
