// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceRCInstanceSystemDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceRCInstanceSystemDiskResponseBody body;

    public static ReplaceRCInstanceSystemDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceRCInstanceSystemDiskResponse self = new ReplaceRCInstanceSystemDiskResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceRCInstanceSystemDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceRCInstanceSystemDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceRCInstanceSystemDiskResponse setBody(ReplaceRCInstanceSystemDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceRCInstanceSystemDiskResponseBody getBody() {
        return this.body;
    }

}
