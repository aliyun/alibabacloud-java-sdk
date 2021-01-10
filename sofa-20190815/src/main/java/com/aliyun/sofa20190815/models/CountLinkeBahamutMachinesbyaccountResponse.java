// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutMachinesbyaccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeBahamutMachinesbyaccountResponseBody body;

    public static CountLinkeBahamutMachinesbyaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutMachinesbyaccountResponse self = new CountLinkeBahamutMachinesbyaccountResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutMachinesbyaccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeBahamutMachinesbyaccountResponse setBody(CountLinkeBahamutMachinesbyaccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeBahamutMachinesbyaccountResponseBody getBody() {
        return this.body;
    }

}
