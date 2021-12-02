// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderRequest extends TeaModel {
    // callerParentId
    @NameInMap("CallerParentId")
    public Long callerParentId;

    // callerType
    @NameInMap("CallerType")
    public String callerType;

    // callerUid
    @NameInMap("CallerUid")
    public Long callerUid;

    // openGroupId
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // orderId
    @NameInMap("OrderId")
    public String orderId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // taskStatus
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static ListDdTaskOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDdTaskOrderRequest self = new ListDdTaskOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListDdTaskOrderRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ListDdTaskOrderRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ListDdTaskOrderRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public ListDdTaskOrderRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public ListDdTaskOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListDdTaskOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDdTaskOrderRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
