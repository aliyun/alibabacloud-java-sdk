// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceV2ResponseBody body;

    public static GetInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceV2Response self = new GetInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public GetInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceV2Response setBody(GetInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
