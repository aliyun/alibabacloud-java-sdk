// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    /**
     * <p>The details of the permission error. If you have the required permissions, an empty string is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;AuthAction\&quot;:\&quot;ram:ListTickets\&quot;,\&quot;AuthPrincipalDisplayName\&quot;:\&quot;2146216584788xxxxx\&quot;,\&quot;AuthPrincipalOwnerId\&quot;:\&quot;1135850448xxxxx\&quot;,\&quot;AuthPrincipalType\&quot;:\&quot;SubUser\&quot;,\&quot;NoPermissionType\&quot;:\&quot;ImplicitDeny\&quot;,\&quot;PolicyType\&quot;:\&quot;AccountLevelIdentityBasedPolicy\&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The return code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The list of your tickets.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTicketsResponseBodyData> data;

    /**
     * <p>The error message. This parameter is returned only when the value of success is false.</p>
     * 
     * <strong>example:</strong>
     * <p>入参解析失败</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the request. A unique ID is returned for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of query results, which is the total number of your tickets.</p>
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
         * <p>The description of the status. Example: Completed.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The value of the status. For example, a value of 6 indicates that the ticket is completed.</p>
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
         * <p>The ticket status. Valid values: assigned (Pending response), dealing (In progress), wait_feedback (Waiting for feedback), feedback (Feedback received), wait_confirm (Pending confirmation), and confirmed (Completed).</p>
         */
        @NameInMap("Status")
        public ListTicketsResponseBodyDataStatus status;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0005PYGCW</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        /**
         * <p>The ticket title.</p>
         * 
         * <strong>example:</strong>
         * <p>Why did ECS renewal fail?</p>
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
