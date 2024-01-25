// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetOpenJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenJMeterSceneResponseBody body;

    public static GetOpenJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenJMeterSceneResponse self = new GetOpenJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenJMeterSceneResponse setBody(GetOpenJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
