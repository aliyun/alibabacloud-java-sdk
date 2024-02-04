// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineWTSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CombineWTSResponseBody body;

    public static CombineWTSResponse build(java.util.Map<String, ?> map) throws Exception {
        CombineWTSResponse self = new CombineWTSResponse();
        return TeaModel.build(map, self);
    }

    public CombineWTSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CombineWTSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CombineWTSResponse setBody(CombineWTSResponseBody body) {
        this.body = body;
        return this;
    }
    public CombineWTSResponseBody getBody() {
        return this.body;
    }

}
