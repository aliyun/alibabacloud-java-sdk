// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTicketResponseBodyData data;

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

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Label")
        public String label;

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
        @NameInMap("Label")
        public String label;

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
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Severity")
        public GetTicketResponseBodyDataSeverity severity;

        @NameInMap("Status")
        public GetTicketResponseBodyDataStatus status;

        @NameInMap("TicketId")
        public String ticketId;

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
