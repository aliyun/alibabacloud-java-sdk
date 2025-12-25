// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The return code of the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value is my ticket list data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTicketsResponseBodyData> data;

    /**
     * <p>The error message. If success is set to false, the message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number of the paging query parameter</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a pagination query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the API request. The requestID is unique for each call.</p>
     * 
     * <strong>example:</strong>
     * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of query results, that is, the total number of my ticket records.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponseBody self = new ListTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>Status description, if completed</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>A status value, such as 6, represents completed</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
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
        /**
         * <p>The status of the ticket. The reference values are as follows 1, &quot;assigned&quot;, &quot;Pending Response&quot;, 2, &quot;handling&quot;, &quot;handling&quot;, 3, &quot;wait_feedback&quot;, &quot;Pending feedback&quot;, 4: &quot;feedback&quot;, &quot;Feedback&quot;, 5, &quot;wait_confirm&quot;, &quot;To be confirmed&quot;, 6, &quot;confirmed&quot;, &quot;Completed&quot;</p>
         */
        @NameInMap("Status")
        public ListTicketsResponseBodyDataStatus status;

        /**
         * <p>Work Order Number</p>
         * 
         * <strong>example:</strong>
         * <p>0005PYGCW</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        /**
         * <p>The title of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>Why ECS backup failed?</p>
         */
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
