// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListTicketsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponseBody self = new ListTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTicketsResponseBody setData(java.util.List<ListTicketsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTicketsResponseBodyData> getData() {
        return this.data;
    }

    public ListTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTicketsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTicketsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTicketsResponseBodyDataStatus extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static ListTicketsResponseBodyDataStatus build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyDataStatus self = new ListTicketsResponseBodyDataStatus();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyDataStatus setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListTicketsResponseBodyDataStatus setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTicketsResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public ListTicketsResponseBodyDataStatus status;

        @NameInMap("TicketId")
        public String ticketId;

        @NameInMap("Title")
        public String title;

        public static ListTicketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyData self = new ListTicketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyData setStatus(ListTicketsResponseBodyDataStatus status) {
            this.status = status;
            return this;
        }
        public ListTicketsResponseBodyDataStatus getStatus() {
            return this.status;
        }

        public ListTicketsResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public ListTicketsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
