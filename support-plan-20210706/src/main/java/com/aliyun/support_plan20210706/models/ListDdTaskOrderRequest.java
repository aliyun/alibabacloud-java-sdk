// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderRequest extends TeaModel {
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

    @NameInMap("IsUrgent")
    public Boolean isUrgent;

    /**
     * <p>openGroupId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAWNN14N</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>pageNo</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

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

    public ListDdTaskOrderRequest setIsUrgent(Boolean isUrgent) {
        this.isUrgent = isUrgent;
        return this;
    }
    public Boolean getIsUrgent() {
        return this.isUrgent;
    }

    public ListDdTaskOrderRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public ListDdTaskOrderRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListDdTaskOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
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
