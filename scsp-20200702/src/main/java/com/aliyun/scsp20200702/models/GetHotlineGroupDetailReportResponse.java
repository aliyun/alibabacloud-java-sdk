// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineGroupDetailReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineGroupDetailReportResponseBody body;

    public static GetHotlineGroupDetailReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineGroupDetailReportResponse self = new GetHotlineGroupDetailReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineGroupDetailReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineGroupDetailReportResponse setBody(GetHotlineGroupDetailReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineGroupDetailReportResponseBody getBody() {
        return this.body;
    }

}
