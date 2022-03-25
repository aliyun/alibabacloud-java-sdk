// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceShutdownTimerV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceShutdownTimerV2ResponseBody body;

    public static GetInstanceShutdownTimerV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceShutdownTimerV2Response self = new GetInstanceShutdownTimerV2Response();
        return TeaModel.build(map, self);
    }

    public GetInstanceShutdownTimerV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceShutdownTimerV2Response setBody(GetInstanceShutdownTimerV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceShutdownTimerV2ResponseBody getBody() {
        return this.body;
    }

}
