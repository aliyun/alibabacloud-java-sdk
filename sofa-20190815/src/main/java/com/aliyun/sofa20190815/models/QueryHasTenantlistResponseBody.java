// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasTenantlistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasTenantlistResponseBodyResultContent resultContent;

    public static QueryHasTenantlistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasTenantlistResponseBody self = new QueryHasTenantlistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasTenantlistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasTenantlistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasTenantlistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasTenantlistResponseBody setResultContent(QueryHasTenantlistResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasTenantlistResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasTenantlistResponseBodyResultContentData extends TeaModel {
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

        public static QueryHasTenantlistResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasTenantlistResponseBodyResultContentData self = new QueryHasTenantlistResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasTenantlistResponseBodyResultContentData setIamId(String iamId) {
            this.iamId = iamId;
            return this;
        }
        public String getIamId() {
            return this.iamId;
        }

        public QueryHasTenantlistResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryHasTenantlistResponseBodyResultContentData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryHasTenantlistResponseBodyResultContentData setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public QueryHasTenantlistResponseBodyResultContentData setBusinessOwnerId(String businessOwnerId) {
            this.businessOwnerId = businessOwnerId;
            return this;
        }
        public String getBusinessOwnerId() {
            return this.businessOwnerId;
        }

        public QueryHasTenantlistResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasTenantlistResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasTenantlistResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasTenantlistResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasTenantlistResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasTenantlistResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasTenantlistResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasTenantlistResponseBodyResultContentTopErrorCode self = new QueryHasTenantlistResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasTenantlistResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasTenantlistResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasTenantlistResponseBodyResultContentTopErrorReason self = new QueryHasTenantlistResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasTenantlistResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasTenantlistResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasTenantlistResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasTenantlistResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasTenantlistResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasTenantlistResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasTenantlistResponseBodyResultContent self = new QueryHasTenantlistResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasTenantlistResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasTenantlistResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasTenantlistResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasTenantlistResponseBodyResultContent setData(java.util.List<QueryHasTenantlistResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasTenantlistResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasTenantlistResponseBodyResultContent setTopErrorCode(QueryHasTenantlistResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasTenantlistResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasTenantlistResponseBodyResultContent setTopErrorReason(QueryHasTenantlistResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasTenantlistResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
