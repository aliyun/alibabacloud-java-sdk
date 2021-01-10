// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchWorkspacegroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasCloudarchWorkspacegroupResponseBodyResultContent resultContent;

    public static CreateHasCloudarchWorkspacegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchWorkspacegroupResponseBody self = new CreateHasCloudarchWorkspacegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchWorkspacegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasCloudarchWorkspacegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasCloudarchWorkspacegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasCloudarchWorkspacegroupResponseBody setResultContent(CreateHasCloudarchWorkspacegroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasCloudarchWorkspacegroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasCloudarchWorkspacegroupResponseBodyResultContentData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("YunyouId")
        public String yunyouId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("Source")
        public String source;

        @NameInMap("Ldc")
        public Boolean ldc;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Uid")
        public String uid;

        public static CreateHasCloudarchWorkspacegroupResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchWorkspacegroupResponseBodyResultContentData self = new CreateHasCloudarchWorkspacegroupResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setYunyouId(String yunyouId) {
            this.yunyouId = yunyouId;
            return this;
        }
        public String getYunyouId() {
            return this.yunyouId;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setLdc(Boolean ldc) {
            this.ldc = ldc;
            return this;
        }
        public Boolean getLdc() {
            return this.ldc;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode self = new CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason self = new CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasCloudarchWorkspacegroupResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasCloudarchWorkspacegroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasCloudarchWorkspacegroupResponseBodyResultContent self = new CreateHasCloudarchWorkspacegroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setData(CreateHasCloudarchWorkspacegroupResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setTopErrorCode(CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasCloudarchWorkspacegroupResponseBodyResultContent setTopErrorReason(CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
