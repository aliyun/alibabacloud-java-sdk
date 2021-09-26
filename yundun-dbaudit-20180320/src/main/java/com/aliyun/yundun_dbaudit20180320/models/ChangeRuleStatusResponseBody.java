// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeRuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeRuleStatusResponseBody self = new ChangeRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
