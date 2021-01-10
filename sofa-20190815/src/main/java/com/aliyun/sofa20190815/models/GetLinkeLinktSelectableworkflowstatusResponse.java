// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktSelectableworkflowstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktSelectableworkflowstatusResponseBody body;

    public static GetLinkeLinktSelectableworkflowstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktSelectableworkflowstatusResponse self = new GetLinkeLinktSelectableworkflowstatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktSelectableworkflowstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktSelectableworkflowstatusResponse setBody(GetLinkeLinktSelectableworkflowstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktSelectableworkflowstatusResponseBody getBody() {
        return this.body;
    }

}
