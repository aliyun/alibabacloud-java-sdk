// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class InitDBInstanceResourceGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitDBInstanceResourceGroupIdResponseBody body;

    public static InitDBInstanceResourceGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDBInstanceResourceGroupIdResponse self = new InitDBInstanceResourceGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public InitDBInstanceResourceGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitDBInstanceResourceGroupIdResponse setBody(InitDBInstanceResourceGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public InitDBInstanceResourceGroupIdResponseBody getBody() {
        return this.body;
    }

}
