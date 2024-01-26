// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportVuserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReportVuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportVuserResponseBody self = new ReportVuserResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportVuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
