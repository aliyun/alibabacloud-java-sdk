// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchCellgroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasCloudarchCellgroupResponseBodyResultContent resultContent;

    public static UpdateHasCloudarchCellgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchCellgroupResponseBody self = new UpdateHasCloudarchCellgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchCellgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasCloudarchCellgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasCloudarchCellgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasCloudarchCellgroupResponseBody setResultContent(UpdateHasCloudarchCellgroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasCloudarchCellgroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasCloudarchCellgroupResponseBodyResultContentData extends TeaModel {
        @NameInMap("PropertiesJsonStr")
        public String propertiesJsonStr;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("YunyouId")
        public String yunyouId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Elastic")
        public Boolean elastic;

        @NameInMap("UidRange")
        public String uidRange;

        @NameInMap("MarkUidRange")
        public String markUidRange;

        @NameInMap("ElasticUidRange")
        public String elasticUidRange;

        @NameInMap("ElasticMarkUidRange")
        public String elasticMarkUidRange;

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

        public static UpdateHasCloudarchCellgroupResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchCellgroupResponseBodyResultContentData self = new UpdateHasCloudarchCellgroupResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setPropertiesJsonStr(String propertiesJsonStr) {
            this.propertiesJsonStr = propertiesJsonStr;
            return this;
        }
        public String getPropertiesJsonStr() {
            return this.propertiesJsonStr;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setYunyouId(String yunyouId) {
            this.yunyouId = yunyouId;
            return this;
        }
        public String getYunyouId() {
            return this.yunyouId;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setUidRange(String uidRange) {
            this.uidRange = uidRange;
            return this;
        }
        public String getUidRange() {
            return this.uidRange;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setMarkUidRange(String markUidRange) {
            this.markUidRange = markUidRange;
            return this;
        }
        public String getMarkUidRange() {
            return this.markUidRange;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setElasticUidRange(String elasticUidRange) {
            this.elasticUidRange = elasticUidRange;
            return this;
        }
        public String getElasticUidRange() {
            return this.elasticUidRange;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setElasticMarkUidRange(String elasticMarkUidRange) {
            this.elasticMarkUidRange = elasticMarkUidRange;
            return this;
        }
        public String getElasticMarkUidRange() {
            return this.elasticMarkUidRange;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode self = new UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason self = new UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasCloudarchCellgroupResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public UpdateHasCloudarchCellgroupResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasCloudarchCellgroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchCellgroupResponseBodyResultContent self = new UpdateHasCloudarchCellgroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setData(UpdateHasCloudarchCellgroupResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public UpdateHasCloudarchCellgroupResponseBodyResultContentData getData() {
            return this.data;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setTopErrorCode(UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasCloudarchCellgroupResponseBodyResultContent setTopErrorReason(UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasCloudarchCellgroupResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
