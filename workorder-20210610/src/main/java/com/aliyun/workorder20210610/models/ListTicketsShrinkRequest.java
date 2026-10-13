// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsShrinkRequest extends TeaModel {
    /**
     * <p>The end time when the ticket was created. Use this parameter with StartDate to query tickets created within a specific time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1623396736000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The keyword for a fuzzy search. The keyword is used to match the content of the Description field of the ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number for a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time when the ticket was created. Use this parameter with EndDate to query tickets created within a specific time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1623396736000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>A list of ticket statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The ticket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0005PYGCW</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>A list of ticket IDs.</p>
     */
    @NameInMap("TicketIdList")
    public String ticketIdListShrink;

    /**
     * <p>The UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1902070573958003</p>
     */
    @NameInMap("Uid")
    public String uid;

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

    public ListTicketsShrinkRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
