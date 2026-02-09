// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1585790280</p>
     */
    @NameInMap("CreatedAfterTime")
    public Long createdAfterTime;

    /**
     * <strong>example:</strong>
     * <p>1586049480</p>
     */
    @NameInMap("CreatedBeforeTime")
    public Long createdBeforeTime;

    /**
     * <strong>example:</strong>
     * <p>ETARNPP,RTARNP</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageStart")
    public Integer pageStart;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>252448085032933023</p>
     */
    @NameInMap("SubUserId")
    public String subUserId;

    /**
     * <strong>example:</strong>
     * <p>wait_confirm,dealing</p>
     */
    @NameInMap("TicketStatus")
    public String ticketStatus;

    public static ListTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsRequest self = new ListTicketsRequest();
        return TeaModel.build(map, self);
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

    public ListTicketsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListTicketsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListTicketsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTicketsRequest setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public Integer getPageStart() {
        return this.pageStart;
    }

    public ListTicketsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListTicketsRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public ListTicketsRequest setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

}
