// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartBaselineSecurityCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBaselineSecurityCheckResponseBody self = new StartBaselineSecurityCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBaselineSecurityCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
