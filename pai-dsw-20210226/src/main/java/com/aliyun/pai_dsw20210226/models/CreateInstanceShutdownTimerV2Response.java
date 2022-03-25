// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceShutdownTimerV2ResponseBody body;

    public static CreateInstanceShutdownTimerV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerV2Response self = new CreateInstanceShutdownTimerV2Response();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceShutdownTimerV2Response setBody(CreateInstanceShutdownTimerV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceShutdownTimerV2ResponseBody getBody() {
        return this.body;
    }

}
