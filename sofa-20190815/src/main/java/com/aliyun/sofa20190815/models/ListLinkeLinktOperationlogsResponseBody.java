// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktOperationlogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<ListLinkeLinktOperationlogsResponseBodyData> data;

    public static ListLinkeLinktOperationlogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktOperationlogsResponseBody self = new ListLinkeLinktOperationlogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktOperationlogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktOperationlogsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktOperationlogsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktOperationlogsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktOperationlogsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktOperationlogsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktOperationlogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktOperationlogsResponseBody setData(java.util.List<ListLinkeLinktOperationlogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktOperationlogsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktOperationlogsResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("CurrentValue")
        public String currentValue;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DisplayContent")
        public String displayContent;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldType")
        public String fieldType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastValue")
        public String lastValue;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static ListLinkeLinktOperationlogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktOperationlogsResponseBodyData self = new ListLinkeLinktOperationlogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktOperationlogsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setDisplayContent(String displayContent) {
            this.displayContent = displayContent;
            return this;
        }
        public String getDisplayContent() {
            return this.displayContent;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setLastValue(String lastValue) {
            this.lastValue = lastValue;
            return this;
        }
        public String getLastValue() {
            return this.lastValue;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListLinkeLinktOperationlogsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
