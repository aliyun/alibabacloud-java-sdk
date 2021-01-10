// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCellPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCellPageResponseBodyResultContent resultContent;

    public static QueryHasCellPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCellPageResponseBody self = new QueryHasCellPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCellPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCellPageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCellPageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCellPageResponseBody setResultContent(QueryHasCellPageResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCellPageResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCellPageResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CellName")
        public String cellName;

        @NameInMap("CellDisplayName")
        public String cellDisplayName;

        @NameInMap("WorkSpaceId")
        public String workSpaceId;

        @NameInMap("WorkSpaceName")
        public String workSpaceName;

        @NameInMap("WorkSpaceDisplayName")
        public String workSpaceDisplayName;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvDisplayName")
        public String envDisplayName;

        @NameInMap("AkeClusterId")
        public String akeClusterId;

        @NameInMap("AkeClusterName")
        public String akeClusterName;

        @NameInMap("AkeKubeConfig")
        public String akeKubeConfig;

        public static QueryHasCellPageResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCellPageResponseBodyResultContentData self = new QueryHasCellPageResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCellPageResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCellPageResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasCellPageResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasCellPageResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasCellPageResponseBodyResultContentData setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryHasCellPageResponseBodyResultContentData setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public QueryHasCellPageResponseBodyResultContentData setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

        public QueryHasCellPageResponseBodyResultContentData setWorkSpaceName(String workSpaceName) {
            this.workSpaceName = workSpaceName;
            return this;
        }
        public String getWorkSpaceName() {
            return this.workSpaceName;
        }

        public QueryHasCellPageResponseBodyResultContentData setWorkSpaceDisplayName(String workSpaceDisplayName) {
            this.workSpaceDisplayName = workSpaceDisplayName;
            return this;
        }
        public String getWorkSpaceDisplayName() {
            return this.workSpaceDisplayName;
        }

        public QueryHasCellPageResponseBodyResultContentData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryHasCellPageResponseBodyResultContentData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryHasCellPageResponseBodyResultContentData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryHasCellPageResponseBodyResultContentData setAkeClusterId(String akeClusterId) {
            this.akeClusterId = akeClusterId;
            return this;
        }
        public String getAkeClusterId() {
            return this.akeClusterId;
        }

        public QueryHasCellPageResponseBodyResultContentData setAkeClusterName(String akeClusterName) {
            this.akeClusterName = akeClusterName;
            return this;
        }
        public String getAkeClusterName() {
            return this.akeClusterName;
        }

        public QueryHasCellPageResponseBodyResultContentData setAkeKubeConfig(String akeKubeConfig) {
            this.akeKubeConfig = akeKubeConfig;
            return this;
        }
        public String getAkeKubeConfig() {
            return this.akeKubeConfig;
        }

    }

    public static class QueryHasCellPageResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCellPageResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCellPageResponseBodyResultContentTopErrorCode self = new QueryHasCellPageResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCellPageResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCellPageResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCellPageResponseBodyResultContentTopErrorReason self = new QueryHasCellPageResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCellPageResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCellPageResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasCellPageResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCellPageResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCellPageResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCellPageResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCellPageResponseBodyResultContent self = new QueryHasCellPageResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCellPageResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCellPageResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCellPageResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCellPageResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasCellPageResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasCellPageResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasCellPageResponseBodyResultContent setData(java.util.List<QueryHasCellPageResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCellPageResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCellPageResponseBodyResultContent setTopErrorCode(QueryHasCellPageResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCellPageResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCellPageResponseBodyResultContent setTopErrorReason(QueryHasCellPageResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCellPageResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
