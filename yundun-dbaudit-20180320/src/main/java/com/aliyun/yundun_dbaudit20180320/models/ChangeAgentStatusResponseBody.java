// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeAgentStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgentStatusResponseBody self = new ChangeAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
