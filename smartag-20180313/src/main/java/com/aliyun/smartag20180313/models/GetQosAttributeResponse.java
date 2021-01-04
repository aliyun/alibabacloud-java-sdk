// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetQosAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQosAttributeResponseBody body;

    public static GetQosAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQosAttributeResponse self = new GetQosAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetQosAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQosAttributeResponse setBody(GetQosAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQosAttributeResponseBody getBody() {
        return this.body;
    }

}
