// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterListAlarmRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGpuClusterListAlarmRecordResponseBody body;

    public static GetGpuClusterListAlarmRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterListAlarmRecordResponse self = new GetGpuClusterListAlarmRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterListAlarmRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGpuClusterListAlarmRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGpuClusterListAlarmRecordResponse setBody(GetGpuClusterListAlarmRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGpuClusterListAlarmRecordResponseBody getBody() {
        return this.body;
    }

}
