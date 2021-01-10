// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody body;

    public static CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse self = new CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponse setBody(CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeantcodeAntcodeUserpersonalaccesstokensidrevokeResponseBody getBody() {
        return this.body;
    }

}
