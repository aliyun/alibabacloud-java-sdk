// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktWorkitemgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeLinktWorkitemgroupResponseBody body;

    public static CountLinkeLinktWorkitemgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktWorkitemgroupResponse self = new CountLinkeLinktWorkitemgroupResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktWorkitemgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeLinktWorkitemgroupResponse setBody(CountLinkeLinktWorkitemgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeLinktWorkitemgroupResponseBody getBody() {
        return this.body;
    }

}
