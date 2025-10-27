// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MassPushV2ResponseBody body;

    public static MassPushV2Response build(java.util.Map<String, ?> map) throws Exception {
        MassPushV2Response self = new MassPushV2Response();
        return TeaModel.build(map, self);
    }

    public MassPushV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MassPushV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MassPushV2Response setBody(MassPushV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public MassPushV2ResponseBody getBody() {
        return this.body;
    }

}
