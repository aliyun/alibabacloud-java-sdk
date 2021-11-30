// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListObjectsV2ResponseBody body;

    public static ListObjectsV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsV2Response self = new ListObjectsV2Response();
        return TeaModel.build(map, self);
    }

    public ListObjectsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListObjectsV2Response setBody(ListObjectsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListObjectsV2ResponseBody getBody() {
        return this.body;
    }

}
