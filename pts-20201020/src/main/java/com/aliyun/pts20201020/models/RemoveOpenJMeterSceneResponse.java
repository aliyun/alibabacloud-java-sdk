// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class RemoveOpenJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveOpenJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveOpenJMeterSceneResponse setBody(RemoveOpenJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
