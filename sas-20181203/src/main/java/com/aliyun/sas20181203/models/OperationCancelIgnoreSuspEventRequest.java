// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCancelIgnoreSuspEventRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The IDs of alert events.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<Long> securityEventIds;

    public static OperationCancelIgnoreSuspEventRequest build(java.util.Map<String, ?> map) throws Exception {
        OperationCancelIgnoreSuspEventRequest self = new OperationCancelIgnoreSuspEventRequest();
        return TeaModel.build(map, self);
    }

    public OperationCancelIgnoreSuspEventRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OperationCancelIgnoreSuspEventRequest setSecurityEventIds(java.util.List<Long> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

}
