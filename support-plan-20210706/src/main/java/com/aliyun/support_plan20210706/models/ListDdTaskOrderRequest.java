// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderRequest extends TeaModel {
    /**
     * <p>callerParentId</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>callerType</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CallerType")
    public String callerType;

    /**
     * <p>callerUid</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CallerUid")
    public Long callerUid;

    /**
     * <p>createRealName</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("CreateRealName")
    public String createRealName;

    /**
     * <p>endTime</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-20 14:09:16</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>openGroupId</p>
     * 
     * <strong>example:</strong>
     * <p>DAWNN14N</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>orderId</p>
     * 
     * <strong>example:</strong>
     * <p>E2112019N14PBY</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>pageNo</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>2F8557E4-742B-1CF7-8E83-28CD0C1F7B48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>startTime</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-01 14:09:11</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>taskStatus</p>
     * 
     * <strong>example:</strong>
     * <p>dealingNode</p>
     */
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

    public ListDdTaskOrderRequest setCreateRealName(String createRealName) {
        this.createRealName = createRealName;
        return this;
    }
    public String getCreateRealName() {
        return this.createRealName;
    }

    public ListDdTaskOrderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public ListDdTaskOrderRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListDdTaskOrderRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDdTaskOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDdTaskOrderRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListDdTaskOrderRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
