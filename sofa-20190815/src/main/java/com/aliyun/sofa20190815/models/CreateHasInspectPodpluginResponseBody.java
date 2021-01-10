// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectPodpluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectPodpluginResponseBodyResultContent resultContent;

    public static CreateHasInspectPodpluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectPodpluginResponseBody self = new CreateHasInspectPodpluginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectPodpluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectPodpluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectPodpluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectPodpluginResponseBody setResultContent(CreateHasInspectPodpluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectPodpluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Code")
        public String code;

        public static CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions self = new CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class CreateHasInspectPodpluginResponseBodyResultContentData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("AvailableActions")
        public java.util.List<CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions> availableActions;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateHasInspectPodpluginResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPodpluginResponseBodyResultContentData self = new CreateHasInspectPodpluginResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setAvailableActions(java.util.List<CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<CreateHasInspectPodpluginResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode self = new CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason self = new CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectPodpluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasInspectPodpluginResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectPodpluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPodpluginResponseBodyResultContent self = new CreateHasInspectPodpluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setData(CreateHasInspectPodpluginResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasInspectPodpluginResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setTopErrorCode(CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectPodpluginResponseBodyResultContent setTopErrorReason(CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectPodpluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
