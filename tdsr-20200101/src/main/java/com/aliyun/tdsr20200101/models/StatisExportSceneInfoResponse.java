// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisExportSceneInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StatisExportSceneInfoResponseBody body;

    public static StatisExportSceneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisExportSceneInfoResponse self = new StatisExportSceneInfoResponse();
        return TeaModel.build(map, self);
    }

    public StatisExportSceneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisExportSceneInfoResponse setBody(StatisExportSceneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisExportSceneInfoResponseBody getBody() {
        return this.body;
    }

}
