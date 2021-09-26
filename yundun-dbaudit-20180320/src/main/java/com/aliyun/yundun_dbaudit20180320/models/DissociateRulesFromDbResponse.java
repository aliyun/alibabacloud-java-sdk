// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateRulesFromDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateRulesFromDbResponseBody body;

    public static DissociateRulesFromDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateRulesFromDbResponse self = new DissociateRulesFromDbResponse();
        return TeaModel.build(map, self);
    }

    public DissociateRulesFromDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateRulesFromDbResponse setBody(DissociateRulesFromDbResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateRulesFromDbResponseBody getBody() {
        return this.body;
    }

}
