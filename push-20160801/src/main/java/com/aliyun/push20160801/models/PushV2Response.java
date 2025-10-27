// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushV2ResponseBody body;

    public static PushV2Response build(java.util.Map<String, ?> map) throws Exception {
        PushV2Response self = new PushV2Response();
        return TeaModel.build(map, self);
    }

    public PushV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushV2Response setBody(PushV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public PushV2ResponseBody getBody() {
        return this.body;
    }

}
