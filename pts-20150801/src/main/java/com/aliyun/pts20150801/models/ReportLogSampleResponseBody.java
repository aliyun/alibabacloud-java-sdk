// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportLogSampleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReportLogSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportLogSampleResponseBody self = new ReportLogSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportLogSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
