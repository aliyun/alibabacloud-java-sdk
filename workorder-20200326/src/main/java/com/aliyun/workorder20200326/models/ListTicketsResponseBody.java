// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListTicketsResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponseBody self = new ListTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTicketsResponseBody setData(ListTicketsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTicketsResponseBodyData getData() {
        return this.data;
    }

    public ListTicketsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTicketsResponseBodyDataList extends TeaModel {
        @NameInMap("TicketStatus")
        public String ticketStatus;

        @NameInMap("Title")
        public String title;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("AddTime")
        public Integer addTime;

        @NameInMap("Id")
        public String id;

        public static ListTicketsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyDataList self = new ListTicketsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyDataList setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        public ListTicketsResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTicketsResponseBodyDataList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTicketsResponseBodyDataList setAddTime(Integer addTime) {
            this.addTime = addTime;
            return this;
        }
        public Integer getAddTime() {
            return this.addTime;
        }

        public ListTicketsResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListTicketsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public java.util.List<ListTicketsResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListTicketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyData self = new ListTicketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListTicketsResponseBodyData setList(java.util.List<ListTicketsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTicketsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTicketsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTicketsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
