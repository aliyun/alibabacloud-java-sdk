// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckTrafficControlTaskExpressionResponseBody extends TeaModel {
    @NameInMap("IsValie")
    public Boolean isValie;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckTrafficControlTaskExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTrafficControlTaskExpressionResponseBody self = new CheckTrafficControlTaskExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTrafficControlTaskExpressionResponseBody setIsValie(Boolean isValie) {
        this.isValie = isValie;
        return this;
    }
    public Boolean getIsValie() {
        return this.isValie;
    }

    public CheckTrafficControlTaskExpressionResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CheckTrafficControlTaskExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
