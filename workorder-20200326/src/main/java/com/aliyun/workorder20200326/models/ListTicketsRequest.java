// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketsRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("CreatedAfterTime")
    public Long createdAfterTime;

    @NameInMap("CreatedBeforeTime")
    public Long createdBeforeTime;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TicketStatus")
    public String ticketStatus;

    @NameInMap("PageStart")
    public Integer pageStart;

    @NameInMap("SubUserId")
    public String subUserId;

    @NameInMap("Language")
    public String language;

    public static ListTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsRequest self = new ListTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListTicketsRequest setCreatedAfterTime(Long createdAfterTime) {
        this.createdAfterTime = createdAfterTime;
        return this;
    }
    public Long getCreatedAfterTime() {
        return this.createdAfterTime;
    }

    public ListTicketsRequest setCreatedBeforeTime(Long createdBeforeTime) {
        this.createdBeforeTime = createdBeforeTime;
        return this;
    }
    public Long getCreatedBeforeTime() {
        return this.createdBeforeTime;
    }

    public ListTicketsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListTicketsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTicketsRequest setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public ListTicketsRequest setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public Integer getPageStart() {
        return this.pageStart;
    }

    public ListTicketsRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public ListTicketsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
