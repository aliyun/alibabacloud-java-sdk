// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateVodUserUsageDetailDataExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVodUserUsageDetailDataExportTaskResponseBody body;

    public static CreateVodUserUsageDetailDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVodUserUsageDetailDataExportTaskResponse self = new CreateVodUserUsageDetailDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVodUserUsageDetailDataExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVodUserUsageDetailDataExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVodUserUsageDetailDataExportTaskResponse setBody(CreateVodUserUsageDetailDataExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodUserUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

}
