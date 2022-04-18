// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsShrinkRequest extends TeaModel {
    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("TicketIdList")
    public String ticketIdListShrink;

    public static ListTicketsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsShrinkRequest self = new ListTicketsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListTicketsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTicketsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTicketsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTicketsShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public ListTicketsShrinkRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListTicketsShrinkRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ListTicketsShrinkRequest setTicketIdListShrink(String ticketIdListShrink) {
        this.ticketIdListShrink = ticketIdListShrink;
        return this;
    }
    public String getTicketIdListShrink() {
        return this.ticketIdListShrink;
    }

}
