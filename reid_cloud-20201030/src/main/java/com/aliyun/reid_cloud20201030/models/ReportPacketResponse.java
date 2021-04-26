// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ReportPacketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportPacketResponseBody body;

    public static ReportPacketResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportPacketResponse self = new ReportPacketResponse();
        return TeaModel.build(map, self);
    }

    public ReportPacketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportPacketResponse setBody(ReportPacketResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportPacketResponseBody getBody() {
        return this.body;
    }

}
