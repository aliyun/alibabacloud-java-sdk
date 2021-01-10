// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineKbasorganizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasBaselineKbasorganizationResponseBodyResultContent resultContent;

    public static QueryHasBaselineKbasorganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineKbasorganizationResponseBody self = new QueryHasBaselineKbasorganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineKbasorganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasBaselineKbasorganizationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasBaselineKbasorganizationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasBaselineKbasorganizationResponseBody setResultContent(QueryHasBaselineKbasorganizationResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasBaselineKbasorganizationResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasBaselineKbasorganizationResponseBodyResultContentData extends TeaModel {
        @NameInMap("IaasMetaDataName")
        public String iaasMetaDataName;

        @NameInMap("NameSpace")
        public String nameSpace;

        @NameInMap("Pod")
        public String pod;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Source")
        public String source;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasBaselineKbasorganizationResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineKbasorganizationResponseBodyResultContentData self = new QueryHasBaselineKbasorganizationResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setIaasMetaDataName(String iaasMetaDataName) {
            this.iaasMetaDataName = iaasMetaDataName;
            return this;
        }
        public String getIaasMetaDataName() {
            return this.iaasMetaDataName;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode self = new QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason self = new QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasBaselineKbasorganizationResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasBaselineKbasorganizationResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasBaselineKbasorganizationResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasBaselineKbasorganizationResponseBodyResultContent self = new QueryHasBaselineKbasorganizationResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setData(java.util.List<QueryHasBaselineKbasorganizationResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasBaselineKbasorganizationResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setTopErrorCode(QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasBaselineKbasorganizationResponseBodyResultContent setTopErrorReason(QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasBaselineKbasorganizationResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
