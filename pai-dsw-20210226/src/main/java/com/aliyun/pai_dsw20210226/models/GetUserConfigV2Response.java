// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserConfigV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserConfigV2ResponseBody body;

    public static GetUserConfigV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigV2Response self = new GetUserConfigV2Response();
        return TeaModel.build(map, self);
    }

    public GetUserConfigV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserConfigV2Response setBody(GetUserConfigV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserConfigV2ResponseBody getBody() {
        return this.body;
    }

}
