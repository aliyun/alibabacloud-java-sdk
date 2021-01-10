// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDingtalkRobotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasDingtalkRobotResponseBodyResultContent resultContent;

    public static CreateHasDingtalkRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDingtalkRobotResponseBody self = new CreateHasDingtalkRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasDingtalkRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasDingtalkRobotResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasDingtalkRobotResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasDingtalkRobotResponseBody setResultContent(CreateHasDingtalkRobotResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasDingtalkRobotResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasDingtalkRobotResponseBodyResultContentData extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TokenUrl")
        public String tokenUrl;

        public static CreateHasDingtalkRobotResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDingtalkRobotResponseBodyResultContentData self = new CreateHasDingtalkRobotResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentData setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }
        public String getTokenUrl() {
            return this.tokenUrl;
        }

    }

    public static class CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode self = new CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason self = new CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasDingtalkRobotResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasDingtalkRobotResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasDingtalkRobotResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasDingtalkRobotResponseBodyResultContent self = new CreateHasDingtalkRobotResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setData(CreateHasDingtalkRobotResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasDingtalkRobotResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setTopErrorCode(CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasDingtalkRobotResponseBodyResultContent setTopErrorReason(CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasDingtalkRobotResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
