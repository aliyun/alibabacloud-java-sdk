// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class ListTicketsRequest extends TeaModel {
    @NameInMap("CreatedAfterTime")
    public String createdAfterTime;

    @NameInMap("CreatedBeforeTime")
    public String createdBeforeTime;

    @NameInMap("ExtraConditionList")
    public java.util.List<ListTicketsRequestExtraConditionList> extraConditionList;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageStart")
    public Integer pageStart;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("TicketStatus")
    public String ticketStatus;

    public static ListTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsRequest self = new ListTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsRequest setCreatedAfterTime(String createdAfterTime) {
        this.createdAfterTime = createdAfterTime;
        return this;
    }
    public String getCreatedAfterTime() {
        return this.createdAfterTime;
    }

    public ListTicketsRequest setCreatedBeforeTime(String createdBeforeTime) {
        this.createdBeforeTime = createdBeforeTime;
        return this;
    }
    public String getCreatedBeforeTime() {
        return this.createdBeforeTime;
    }

    public ListTicketsRequest setExtraConditionList(java.util.List<ListTicketsRequestExtraConditionList> extraConditionList) {
        this.extraConditionList = extraConditionList;
        return this;
    }
    public java.util.List<ListTicketsRequestExtraConditionList> getExtraConditionList() {
        return this.extraConditionList;
    }

    public ListTicketsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
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

    public ListTicketsRequest setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public static class ListTicketsRequestExtraConditionList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListTicketsRequestExtraConditionList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsRequestExtraConditionList self = new ListTicketsRequestExtraConditionList();
            return TeaModel.build(map, self);
        }

        public ListTicketsRequestExtraConditionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTicketsRequestExtraConditionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
