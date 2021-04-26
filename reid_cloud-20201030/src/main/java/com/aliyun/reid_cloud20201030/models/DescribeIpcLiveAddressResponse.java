// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeIpcLiveAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpcLiveAddressResponseBody body;

    public static DescribeIpcLiveAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcLiveAddressResponse self = new DescribeIpcLiveAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpcLiveAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpcLiveAddressResponse setBody(DescribeIpcLiveAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpcLiveAddressResponseBody getBody() {
        return this.body;
    }

}
