// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    @NameInMap("BrandUserNick")
    public String brandUserNick;

    @NameInMap("CurrencyType")
    public Long currencyType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MarketingType")
    public Integer marketingType;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProxyUserNick")
    public String proxyUserNick;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public String taskType;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setBrandUserNick(String brandUserNick) {
        this.brandUserNick = brandUserNick;
        return this;
    }
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    public ListTasksRequest setCurrencyType(Long currencyType) {
        this.currencyType = currencyType;
        return this;
    }
    public Long getCurrencyType() {
        return this.currencyType;
    }

    public ListTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTasksRequest setMarketingType(Integer marketingType) {
        this.marketingType = marketingType;
        return this;
    }
    public Integer getMarketingType() {
        return this.marketingType;
    }

    public ListTasksRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTasksRequest setProxyUserNick(String proxyUserNick) {
        this.proxyUserNick = proxyUserNick;
        return this;
    }
    public String getProxyUserNick() {
        return this.proxyUserNick;
    }

    public ListTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTasksRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListTasksRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
