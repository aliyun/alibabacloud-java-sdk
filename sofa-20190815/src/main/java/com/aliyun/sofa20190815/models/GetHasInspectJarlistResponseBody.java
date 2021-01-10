// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJarlistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectJarlistResponseBodyResultContent resultContent;

    public static GetHasInspectJarlistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJarlistResponseBody self = new GetHasInspectJarlistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJarlistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectJarlistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectJarlistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectJarlistResponseBody setResultContent(GetHasInspectJarlistResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectJarlistResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectJarlistResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static GetHasInspectJarlistResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJarlistResponseBodyResultContentDataAvailableActions self = new GetHasInspectJarlistResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJarlistResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectJarlistResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetHasInspectJarlistResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("JarSrc")
        public java.util.List<String> jarSrc;

        @NameInMap("AvailableActions")
        public java.util.List<GetHasInspectJarlistResponseBodyResultContentDataAvailableActions> availableActions;

        public static GetHasInspectJarlistResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJarlistResponseBodyResultContentData self = new GetHasInspectJarlistResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJarlistResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setJarSrc(java.util.List<String> jarSrc) {
            this.jarSrc = jarSrc;
            return this;
        }
        public java.util.List<String> getJarSrc() {
            return this.jarSrc;
        }

        public GetHasInspectJarlistResponseBodyResultContentData setAvailableActions(java.util.List<GetHasInspectJarlistResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<GetHasInspectJarlistResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

    }

    public static class GetHasInspectJarlistResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectJarlistResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJarlistResponseBodyResultContentTopErrorCode self = new GetHasInspectJarlistResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectJarlistResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectJarlistResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJarlistResponseBodyResultContentTopErrorReason self = new GetHasInspectJarlistResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectJarlistResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectJarlistResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectJarlistResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectJarlistResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectJarlistResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectJarlistResponseBodyResultContent self = new GetHasInspectJarlistResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectJarlistResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectJarlistResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectJarlistResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectJarlistResponseBodyResultContent setData(GetHasInspectJarlistResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectJarlistResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectJarlistResponseBodyResultContent setTopErrorCode(GetHasInspectJarlistResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectJarlistResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectJarlistResponseBodyResultContent setTopErrorReason(GetHasInspectJarlistResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectJarlistResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
