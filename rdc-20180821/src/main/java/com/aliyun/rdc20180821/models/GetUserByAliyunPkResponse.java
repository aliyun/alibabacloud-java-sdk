// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetUserByAliyunPkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserByAliyunPkResponseBody body;

    public static GetUserByAliyunPkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAliyunPkResponse self = new GetUserByAliyunPkResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByAliyunPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByAliyunPkResponse setBody(GetUserByAliyunPkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByAliyunPkResponseBody getBody() {
        return this.body;
    }

}
