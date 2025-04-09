// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DismissNumberDistrictInfoParsingResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DismissNumberDistrictInfoParsingResultResponseBody body;

    public static DismissNumberDistrictInfoParsingResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DismissNumberDistrictInfoParsingResultResponse self = new DismissNumberDistrictInfoParsingResultResponse();
        return TeaModel.build(map, self);
    }

    public DismissNumberDistrictInfoParsingResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DismissNumberDistrictInfoParsingResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DismissNumberDistrictInfoParsingResultResponse setBody(DismissNumberDistrictInfoParsingResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DismissNumberDistrictInfoParsingResultResponseBody getBody() {
        return this.body;
    }

}
