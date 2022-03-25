// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class StopInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopInstanceV2ResponseBody body;

    public static StopInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceV2Response self = new StopInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public StopInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstanceV2Response setBody(StopInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
