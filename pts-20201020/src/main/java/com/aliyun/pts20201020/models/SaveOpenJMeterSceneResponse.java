// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveOpenJMeterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveOpenJMeterSceneResponse setBody(SaveOpenJMeterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

}
