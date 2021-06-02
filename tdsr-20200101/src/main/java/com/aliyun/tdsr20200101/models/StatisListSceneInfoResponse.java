// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisListSceneInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StatisListSceneInfoResponseBody body;

    public static StatisListSceneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisListSceneInfoResponse self = new StatisListSceneInfoResponse();
        return TeaModel.build(map, self);
    }

    public StatisListSceneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisListSceneInfoResponse setBody(StatisListSceneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisListSceneInfoResponseBody getBody() {
        return this.body;
    }

}
