// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchLocalallcellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchLocalallcellResponseBodyResultContent resultContent;

    public static QueryHasCloudarchLocalallcellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchLocalallcellResponseBody self = new QueryHasCloudarchLocalallcellResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchLocalallcellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchLocalallcellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchLocalallcellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchLocalallcellResponseBody setResultContent(QueryHasCloudarchLocalallcellResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchLocalallcellResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchLocalallcellResponseBodyResultContentData extends TeaModel {
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

        public static QueryHasCloudarchLocalallcellResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchLocalallcellResponseBodyResultContentData self = new QueryHasCloudarchLocalallcellResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setWorkSpaceName(String workSpaceName) {
            this.workSpaceName = workSpaceName;
            return this;
        }
        public String getWorkSpaceName() {
            return this.workSpaceName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setWorkSpaceDisplayName(String workSpaceDisplayName) {
            this.workSpaceDisplayName = workSpaceDisplayName;
            return this;
        }
        public String getWorkSpaceDisplayName() {
            return this.workSpaceDisplayName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setAkeClusterId(String akeClusterId) {
            this.akeClusterId = akeClusterId;
            return this;
        }
        public String getAkeClusterId() {
            return this.akeClusterId;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setAkeClusterName(String akeClusterName) {
            this.akeClusterName = akeClusterName;
            return this;
        }
        public String getAkeClusterName() {
            return this.akeClusterName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentData setAkeKubeConfig(String akeKubeConfig) {
            this.akeKubeConfig = akeKubeConfig;
            return this;
        }
        public String getAkeKubeConfig() {
            return this.akeKubeConfig;
        }

    }

    public static class QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchLocalallcellResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasCloudarchLocalallcellResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchLocalallcellResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchLocalallcellResponseBodyResultContent self = new QueryHasCloudarchLocalallcellResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setData(java.util.List<QueryHasCloudarchLocalallcellResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchLocalallcellResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setTopErrorCode(QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchLocalallcellResponseBodyResultContent setTopErrorReason(QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchLocalallcellResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
