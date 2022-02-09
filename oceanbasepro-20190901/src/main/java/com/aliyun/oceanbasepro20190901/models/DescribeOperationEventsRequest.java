// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOperationEventsRequest extends TeaModel {
    // 参数历史查看的结束时间。
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventDescriptions")
    public String eventDescriptions;

    @NameInMap("EventSources")
    public String eventSources;

    @NameInMap("EventTypes")
    public String eventTypes;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryKey")
    public String queryKey;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    // 参数历史查看的起始时间。
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOperationEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationEventsRequest self = new DescribeOperationEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperationEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOperationEventsRequest setEventDescriptions(String eventDescriptions) {
        this.eventDescriptions = eventDescriptions;
        return this;
    }
    public String getEventDescriptions() {
        return this.eventDescriptions;
    }

    public DescribeOperationEventsRequest setEventSources(String eventSources) {
        this.eventSources = eventSources;
        return this;
    }
    public String getEventSources() {
        return this.eventSources;
    }

    public DescribeOperationEventsRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public DescribeOperationEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOperationEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOperationEventsRequest setQueryKey(String queryKey) {
        this.queryKey = queryKey;
        return this;
    }
    public String getQueryKey() {
        return this.queryKey;
    }

    public DescribeOperationEventsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeOperationEventsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeOperationEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
