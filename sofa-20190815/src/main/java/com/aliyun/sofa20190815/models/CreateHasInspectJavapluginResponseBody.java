// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectJavapluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectJavapluginResponseBodyResultContent resultContent;

    public static CreateHasInspectJavapluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectJavapluginResponseBody self = new CreateHasInspectJavapluginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectJavapluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectJavapluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectJavapluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectJavapluginResponseBody setResultContent(CreateHasInspectJavapluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectJavapluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Code")
        public String code;

        public static CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions self = new CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class CreateHasInspectJavapluginResponseBodyResultContentData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("AvailableActions")
        public java.util.List<CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions> availableActions;

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

        public static CreateHasInspectJavapluginResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectJavapluginResponseBodyResultContentData self = new CreateHasInspectJavapluginResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setAvailableActions(java.util.List<CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<CreateHasInspectJavapluginResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode self = new CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason self = new CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectJavapluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasInspectJavapluginResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectJavapluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectJavapluginResponseBodyResultContent self = new CreateHasInspectJavapluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setData(CreateHasInspectJavapluginResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasInspectJavapluginResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setTopErrorCode(CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectJavapluginResponseBodyResultContent setTopErrorReason(CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectJavapluginResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
