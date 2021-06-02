// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StatisQueryByTypeResponseBody body;

    public static StatisQueryByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByTypeResponse self = new StatisQueryByTypeResponse();
        return TeaModel.build(map, self);
    }

    public StatisQueryByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisQueryByTypeResponse setBody(StatisQueryByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisQueryByTypeResponseBody getBody() {
        return this.body;
    }

}
