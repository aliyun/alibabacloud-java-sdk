// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class AddSharesToExpressSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSharesToExpressSyncResponseBody body;

    public static AddSharesToExpressSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSharesToExpressSyncResponse self = new AddSharesToExpressSyncResponse();
        return TeaModel.build(map, self);
    }

    public AddSharesToExpressSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSharesToExpressSyncResponse setBody(AddSharesToExpressSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSharesToExpressSyncResponseBody getBody() {
        return this.body;
    }

}
