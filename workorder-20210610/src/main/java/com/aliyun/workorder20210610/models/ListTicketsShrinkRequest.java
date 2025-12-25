// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsShrinkRequest extends TeaModel {
    /**
     * <p>The deadline for ticket creation. This parameter is used in conjunction with StartDate to query tickets submitted within the specified start and end time ranges.</p>
     * 
     * <strong>example:</strong>
     * <p>1623396736000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The ticket keyword, which is used for fuzzy search to match the content of the Description field when a ticket is created.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Paging query page number parameters</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries queried by page parameter</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time when the ticket was created. This parameter is used with EndDate to query tickets that are created within the specified start and end time ranges.</p>
     * 
     * <strong>example:</strong>
     * <p>1623396736000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>Multiple ticket statuses</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>Work Order Number</p>
     * 
     * <strong>example:</strong>
     * <p>0005PYGCW</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>Multiple job numbers</p>
     */
    @NameInMap("TicketIdList")
    public String ticketIdListShrink;

    /**
     * <p>UID</p>
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
