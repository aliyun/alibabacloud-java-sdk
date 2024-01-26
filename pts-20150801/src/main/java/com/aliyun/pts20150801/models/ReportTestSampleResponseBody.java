// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportTestSampleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReportTestSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportTestSampleResponseBody self = new ReportTestSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportTestSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
