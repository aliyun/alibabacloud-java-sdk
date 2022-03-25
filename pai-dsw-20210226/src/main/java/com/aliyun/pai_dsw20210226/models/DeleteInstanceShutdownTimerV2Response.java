// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceShutdownTimerV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceShutdownTimerV2ResponseBody body;

    public static DeleteInstanceShutdownTimerV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceShutdownTimerV2Response self = new DeleteInstanceShutdownTimerV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceShutdownTimerV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceShutdownTimerV2Response setBody(DeleteInstanceShutdownTimerV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceShutdownTimerV2ResponseBody getBody() {
        return this.body;
    }

}
