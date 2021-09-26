// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ClearAgentRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ClearAgentRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentRecordsResponseBody self = new ClearAgentRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearAgentRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
