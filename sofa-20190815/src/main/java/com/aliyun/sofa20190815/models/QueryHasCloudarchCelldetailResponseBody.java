// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchCelldetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchCelldetailResponseBodyResultContent resultContent;

    public static QueryHasCloudarchCelldetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchCelldetailResponseBody self = new QueryHasCloudarchCelldetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchCelldetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchCelldetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchCelldetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchCelldetailResponseBody setResultContent(QueryHasCloudarchCelldetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchCelldetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchCelldetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("PropertiesJsonStr")
        public String propertiesJsonStr;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("YunyouId")
        public String yunyouId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("CellGroup")
        public String cellGroup;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Source")
        public String source;

        @NameInMap("Tenant")
        public String tenant;

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

        public static QueryHasCloudarchCelldetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchCelldetailResponseBodyResultContentData self = new QueryHasCloudarchCelldetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setPropertiesJsonStr(String propertiesJsonStr) {
            this.propertiesJsonStr = propertiesJsonStr;
            return this;
        }
        public String getPropertiesJsonStr() {
            return this.propertiesJsonStr;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setYunyouId(String yunyouId) {
            this.yunyouId = yunyouId;
            return this;
        }
        public String getYunyouId() {
            return this.yunyouId;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchCelldetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasCloudarchCelldetailResponseBodyResultContentData data;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason topErrorReason;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode topErrorCode;

        public static QueryHasCloudarchCelldetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchCelldetailResponseBodyResultContent self = new QueryHasCloudarchCelldetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setData(QueryHasCloudarchCelldetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasCloudarchCelldetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setTopErrorReason(QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

        public QueryHasCloudarchCelldetailResponseBodyResultContent setTopErrorCode(QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchCelldetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

    }

}
