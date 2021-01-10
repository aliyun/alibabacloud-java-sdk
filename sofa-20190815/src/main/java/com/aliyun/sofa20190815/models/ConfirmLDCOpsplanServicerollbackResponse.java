// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLDCOpsplanServicerollbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLDCOpsplanServicerollbackResponseBody body;

    public static ConfirmLDCOpsplanServicerollbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLDCOpsplanServicerollbackResponse self = new ConfirmLDCOpsplanServicerollbackResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLDCOpsplanServicerollbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLDCOpsplanServicerollbackResponse setBody(ConfirmLDCOpsplanServicerollbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLDCOpsplanServicerollbackResponseBody getBody() {
        return this.body;
    }

}
