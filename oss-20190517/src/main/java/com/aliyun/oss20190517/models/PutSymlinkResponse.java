// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutSymlinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static PutSymlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        PutSymlinkResponse self = new PutSymlinkResponse();
        return TeaModel.build(map, self);
    }

    public PutSymlinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
