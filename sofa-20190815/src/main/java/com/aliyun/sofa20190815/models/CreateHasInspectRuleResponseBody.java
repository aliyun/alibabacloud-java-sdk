// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectRuleResponseBodyResultContent resultContent;

    public static CreateHasInspectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectRuleResponseBody self = new CreateHasInspectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectRuleResponseBody setResultContent(CreateHasInspectRuleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectRuleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectRuleResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        public static CreateHasInspectRuleResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContentDataTags self = new CreateHasInspectRuleResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectRuleResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public CreateHasInspectRuleResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        public static CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam self = new CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateHasInspectRuleResponseBodyResultContentData extends TeaModel {
        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("PluginId")
        public String pluginId;

        @NameInMap("Args")
        public String args;

        @NameInMap("Tags")
        public java.util.List<CreateHasInspectRuleResponseBodyResultContentDataTags> tags;

        @NameInMap("MaintainTeam")
        public CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam maintainTeam;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("FixMethod")
        public String fixMethod;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateHasInspectRuleResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContentData self = new CreateHasInspectRuleResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContentData setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setTags(java.util.List<CreateHasInspectRuleResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateHasInspectRuleResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setMaintainTeam(CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam maintainTeam) {
            this.maintainTeam = maintainTeam;
            return this;
        }
        public CreateHasInspectRuleResponseBodyResultContentDataMaintainTeam getMaintainTeam() {
            return this.maintainTeam;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setFixMethod(String fixMethod) {
            this.fixMethod = fixMethod;
            return this;
        }
        public String getFixMethod() {
            return this.fixMethod;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasInspectRuleResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasInspectRuleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasInspectRuleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContentTopErrorCode self = new CreateHasInspectRuleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectRuleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectRuleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContentTopErrorReason self = new CreateHasInspectRuleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectRuleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectRuleResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasInspectRuleResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectRuleResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectRuleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectRuleResponseBodyResultContent self = new CreateHasInspectRuleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectRuleResponseBodyResultContent setData(CreateHasInspectRuleResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasInspectRuleResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasInspectRuleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectRuleResponseBodyResultContent setTopErrorCode(CreateHasInspectRuleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectRuleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectRuleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectRuleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectRuleResponseBodyResultContent setTopErrorReason(CreateHasInspectRuleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectRuleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
