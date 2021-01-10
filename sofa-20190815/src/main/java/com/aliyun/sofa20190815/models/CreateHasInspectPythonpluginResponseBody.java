// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectPythonpluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectPythonpluginResponseBodyResultContent resultContent;

    public static CreateHasInspectPythonpluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectPythonpluginResponseBody self = new CreateHasInspectPythonpluginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectPythonpluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectPythonpluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectPythonpluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectPythonpluginResponseBody setResultContent(CreateHasInspectPythonpluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectPythonpluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Code")
        public String code;

        public static CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions self = new CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class CreateHasInspectPythonpluginResponseBodyResultContentData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("AvailableActions")
        public java.util.List<CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions> availableActions;

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

        public static CreateHasInspectPythonpluginResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPythonpluginResponseBodyResultContentData self = new CreateHasInspectPythonpluginResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setAvailableActions(java.util.List<CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<CreateHasInspectPythonpluginResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode self = new CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason self = new CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectPythonpluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasInspectPythonpluginResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectPythonpluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectPythonpluginResponseBodyResultContent self = new CreateHasInspectPythonpluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setData(CreateHasInspectPythonpluginResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasInspectPythonpluginResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setTopErrorCode(CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectPythonpluginResponseBodyResultContent setTopErrorReason(CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectPythonpluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
