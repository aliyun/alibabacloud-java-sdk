// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class StartInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartInstanceV2ResponseBody body;

    public static StartInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceV2Response self = new StartInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public StartInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartInstanceV2Response setBody(StartInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public StartInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
