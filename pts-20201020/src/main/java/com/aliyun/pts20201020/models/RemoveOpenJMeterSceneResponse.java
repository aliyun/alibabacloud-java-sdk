// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class RemoveOpenJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveOpenJMeterSceneResponseBody body;

    public static RemoveOpenJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveOpenJMeterSceneResponse self = new RemoveOpenJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public RemoveOpenJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveOpenJMeterSceneResponse setBody(RemoveOpenJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
