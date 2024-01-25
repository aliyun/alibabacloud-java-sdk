// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserVpcVSwitchResponseBody body;

    public static GetUserVpcVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcVSwitchResponse self = new GetUserVpcVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetUserVpcVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserVpcVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserVpcVSwitchResponse setBody(GetUserVpcVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserVpcVSwitchResponseBody getBody() {
        return this.body;
    }

}
