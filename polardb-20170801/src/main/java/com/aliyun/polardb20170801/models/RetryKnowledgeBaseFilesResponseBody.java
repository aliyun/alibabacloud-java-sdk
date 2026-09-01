// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("Items")
    public java.util.List<RetryKnowledgeBaseFilesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SucceededCount")
    public Integer succeededCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static RetryKnowledgeBaseFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseFilesResponseBody self = new RetryKnowledgeBaseFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseFilesResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public RetryKnowledgeBaseFilesResponseBody setItems(java.util.List<RetryKnowledgeBaseFilesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<RetryKnowledgeBaseFilesResponseBodyItems> getItems() {
        return this.items;
    }

    public RetryKnowledgeBaseFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryKnowledgeBaseFilesResponseBody setSucceededCount(Integer succeededCount) {
        this.succeededCount = succeededCount;
        return this;
    }
    public Integer getSucceededCount() {
        return this.succeededCount;
    }

    public RetryKnowledgeBaseFilesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class RetryKnowledgeBaseFilesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AclProjectionNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>No active ACL projection exists for the IM document</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RetryKnowledgeBaseFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseFilesResponseBodyItems self = new RetryKnowledgeBaseFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseFilesResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RetryKnowledgeBaseFilesResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RetryKnowledgeBaseFilesResponseBodyItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public RetryKnowledgeBaseFilesResponseBodyItems setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
