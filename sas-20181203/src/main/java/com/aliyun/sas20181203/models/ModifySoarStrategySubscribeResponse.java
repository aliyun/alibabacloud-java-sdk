// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySoarStrategySubscribeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySoarStrategySubscribeResponseBody body;

    public static ModifySoarStrategySubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySoarStrategySubscribeResponse self = new ModifySoarStrategySubscribeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySoarStrategySubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySoarStrategySubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySoarStrategySubscribeResponse setBody(ModifySoarStrategySubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySoarStrategySubscribeResponseBody getBody() {
        return this.body;
    }

}
