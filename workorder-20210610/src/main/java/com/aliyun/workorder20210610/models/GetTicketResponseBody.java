// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
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
     * <p>The data returned after the call succeeds.</p>
     */
    @NameInMap("Data")
    public GetTicketResponseBodyData data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C499BB0F-630D-5BE6-B3EA-5FCD95B85503</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of query results, that is, the total number of my ticket records.</p>
     * 
     * <strong>example:</strong>
     * <p>108</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetTicketResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTicketResponseBody setData(GetTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketResponseBodyData getData() {
        return this.data;
    }

    public GetTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetTicketResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTicketResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetTicketResponseBodyDataSeverity extends TeaModel {
        /**
         * <p>Enumeration Text</p>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Enumeration</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTicketResponseBodyDataSeverity build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyDataSeverity self = new GetTicketResponseBodyDataSeverity();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyDataSeverity setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTicketResponseBodyDataSeverity setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTicketResponseBodyDataStatus extends TeaModel {
        /**
         * <p>Status Enumeration Text</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>State enumeration value</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTicketResponseBodyDataStatus build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyDataStatus self = new GetTicketResponseBodyDataStatus();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyDataStatus setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTicketResponseBodyDataStatus setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTicketResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the ticket issue category.</p>
         * 
         * <strong>example:</strong>
         * <p>7161</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The timestamp when the ticket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1623396736000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The uid of the ticket creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1168025</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the ticket. Only pure text format is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Why ECS renewal failed?</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Urgency enumeration value, 1 for general problem, 2 for urgent problem</p>
         */
        @NameInMap("Severity")
        public GetTicketResponseBodyDataSeverity severity;

        /**
         * <p>The status of the ticket. The reference values are as follows 1, &quot;assigned&quot;, &quot;Pending Response&quot;, 2, &quot;handling&quot;, &quot;handling&quot;, 3, &quot;wait_feedback&quot;, &quot;Pending feedback&quot;, 4: &quot;feedback&quot;, &quot;Feedback&quot;, 5, &quot;wait_confirm&quot;, &quot;To be confirmed&quot;, 6, &quot;confirmed&quot;, &quot;Completed&quot;</p>
         */
        @NameInMap("Status")
        public GetTicketResponseBodyDataStatus status;

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
         * <p>Why ECS renewal failed?</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyData self = new GetTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetTicketResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTicketResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetTicketResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTicketResponseBodyData setSeverity(GetTicketResponseBodyDataSeverity severity) {
            this.severity = severity;
            return this;
        }
        public GetTicketResponseBodyDataSeverity getSeverity() {
            return this.severity;
        }

        public GetTicketResponseBodyData setStatus(GetTicketResponseBodyDataStatus status) {
            this.status = status;
            return this;
        }
        public GetTicketResponseBodyDataStatus getStatus() {
            return this.status;
        }

        public GetTicketResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public GetTicketResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
