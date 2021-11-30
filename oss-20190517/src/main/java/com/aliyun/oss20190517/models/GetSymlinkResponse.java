// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetSymlinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static GetSymlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSymlinkResponse self = new GetSymlinkResponse();
        return TeaModel.build(map, self);
    }

    public GetSymlinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
