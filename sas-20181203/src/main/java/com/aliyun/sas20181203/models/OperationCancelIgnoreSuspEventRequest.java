// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCancelIgnoreSuspEventRequest extends TeaModel {
    @NameInMap("SecurityEventIds")
    public java.util.List<Long> securityEventIds;

    public static OperationCancelIgnoreSuspEventRequest build(java.util.Map<String, ?> map) throws Exception {
        OperationCancelIgnoreSuspEventRequest self = new OperationCancelIgnoreSuspEventRequest();
        return TeaModel.build(map, self);
    }

    public OperationCancelIgnoreSuspEventRequest setSecurityEventIds(java.util.List<Long> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

}
