// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ResourceStatusNotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ResourceStatusNotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResourceStatusNotifyResponse self = new ResourceStatusNotifyResponse();
        return TeaModel.build(map, self);
    }

    public ResourceStatusNotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
