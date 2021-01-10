// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSTopologyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTSTopologyVersionResponseBody body;

    public static AddTSTopologyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTSTopologyVersionResponse self = new AddTSTopologyVersionResponse();
        return TeaModel.build(map, self);
    }

    public AddTSTopologyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTSTopologyVersionResponse setBody(AddTSTopologyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTSTopologyVersionResponseBody getBody() {
        return this.body;
    }

}
