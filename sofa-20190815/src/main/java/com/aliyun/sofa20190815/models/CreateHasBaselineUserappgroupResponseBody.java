// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasBaselineUserappgroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasBaselineUserappgroupResponseBodyResultContent resultContent;

    public static CreateHasBaselineUserappgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasBaselineUserappgroupResponseBody self = new CreateHasBaselineUserappgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasBaselineUserappgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasBaselineUserappgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasBaselineUserappgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasBaselineUserappgroupResponseBody setResultContent(CreateHasBaselineUserappgroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasBaselineUserappgroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasBaselineUserappgroupResponseBodyResultContentData extends TeaModel {
        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateHasBaselineUserappgroupResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineUserappgroupResponseBodyResultContentData self = new CreateHasBaselineUserappgroupResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode self = new CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason self = new CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasBaselineUserappgroupResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasBaselineUserappgroupResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasBaselineUserappgroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineUserappgroupResponseBodyResultContent self = new CreateHasBaselineUserappgroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setData(CreateHasBaselineUserappgroupResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasBaselineUserappgroupResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setTopErrorCode(CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasBaselineUserappgroupResponseBodyResultContent setTopErrorReason(CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasBaselineUserappgroupResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
