// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveOpenJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveOpenJMeterSceneResponseBody body;

    public static SaveOpenJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOpenJMeterSceneResponse self = new SaveOpenJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public SaveOpenJMeterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOpenJMeterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveOpenJMeterSceneResponse setBody(SaveOpenJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
