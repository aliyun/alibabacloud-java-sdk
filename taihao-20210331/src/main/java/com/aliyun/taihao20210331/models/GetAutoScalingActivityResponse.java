// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoScalingActivityResponseBody body;

    public static GetAutoScalingActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityResponse self = new GetAutoScalingActivityResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingActivityResponse setBody(GetAutoScalingActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingActivityResponseBody getBody() {
        return this.body;
    }

}
