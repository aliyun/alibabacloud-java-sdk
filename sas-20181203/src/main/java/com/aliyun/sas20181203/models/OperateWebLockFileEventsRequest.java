// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateWebLockFileEventsRequest extends TeaModel {
    @NameInMap("DealAll")
    public Integer dealAll;

    @NameInMap("EventIds")
    public java.util.List<Long> eventIds;

    @NameInMap("OperationCode")
    public String operationCode;

    public static OperateWebLockFileEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateWebLockFileEventsRequest self = new OperateWebLockFileEventsRequest();
        return TeaModel.build(map, self);
    }

    public OperateWebLockFileEventsRequest setDealAll(Integer dealAll) {
        this.dealAll = dealAll;
        return this;
    }
    public Integer getDealAll() {
        return this.dealAll;
    }

    public OperateWebLockFileEventsRequest setEventIds(java.util.List<Long> eventIds) {
        this.eventIds = eventIds;
        return this;
    }
    public java.util.List<Long> getEventIds() {
        return this.eventIds;
    }

    public OperateWebLockFileEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

}
