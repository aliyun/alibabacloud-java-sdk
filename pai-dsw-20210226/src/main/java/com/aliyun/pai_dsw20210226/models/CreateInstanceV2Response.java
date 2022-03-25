// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceV2ResponseBody body;

    public static CreateInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceV2Response self = new CreateInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public CreateInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceV2Response setBody(CreateInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
