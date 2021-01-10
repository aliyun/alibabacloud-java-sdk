// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitLinkeantcodeAntcodeUserprivatetokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody body;

    public static ReinitLinkeantcodeAntcodeUserprivatetokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitLinkeantcodeAntcodeUserprivatetokenResponse self = new ReinitLinkeantcodeAntcodeUserprivatetokenResponse();
        return TeaModel.build(map, self);
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitLinkeantcodeAntcodeUserprivatetokenResponse setBody(ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitLinkeantcodeAntcodeUserprivatetokenResponseBody getBody() {
        return this.body;
    }

}
