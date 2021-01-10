// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchTenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchTenantResponseBodyResultContent resultContent;

    public static QueryHasCloudarchTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchTenantResponseBody self = new QueryHasCloudarchTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchTenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchTenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchTenantResponseBody setResultContent(QueryHasCloudarchTenantResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchTenantResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchTenantResponseBodyResultContentData extends TeaModel {
        @NameInMap("IamId")
        public String iamId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("MasterId")
        public String masterId;

        @NameInMap("BusinessOwnerId")
        public String businessOwnerId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasCloudarchTenantResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchTenantResponseBodyResultContentData self = new QueryHasCloudarchTenantResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setIamId(String iamId) {
            this.iamId = iamId;
            return this;
        }
        public String getIamId() {
            return this.iamId;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setBusinessOwnerId(String businessOwnerId) {
            this.businessOwnerId = businessOwnerId;
            return this;
        }
        public String getBusinessOwnerId() {
            return this.businessOwnerId;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchTenantResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasCloudarchTenantResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchTenantResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchTenantResponseBodyResultContent self = new QueryHasCloudarchTenantResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setData(java.util.List<QueryHasCloudarchTenantResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchTenantResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setTopErrorCode(QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchTenantResponseBodyResultContent setTopErrorReason(QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchTenantResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
