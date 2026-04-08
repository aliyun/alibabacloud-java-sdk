// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckTrafficControlTaskExpressionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsValie")
    public Boolean isValie;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
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
