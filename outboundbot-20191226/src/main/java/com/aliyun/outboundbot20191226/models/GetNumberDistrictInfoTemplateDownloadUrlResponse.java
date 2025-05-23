// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetNumberDistrictInfoTemplateDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNumberDistrictInfoTemplateDownloadUrlResponseBody body;

    public static GetNumberDistrictInfoTemplateDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumberDistrictInfoTemplateDownloadUrlResponse self = new GetNumberDistrictInfoTemplateDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetNumberDistrictInfoTemplateDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumberDistrictInfoTemplateDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNumberDistrictInfoTemplateDownloadUrlResponse setBody(GetNumberDistrictInfoTemplateDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumberDistrictInfoTemplateDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
