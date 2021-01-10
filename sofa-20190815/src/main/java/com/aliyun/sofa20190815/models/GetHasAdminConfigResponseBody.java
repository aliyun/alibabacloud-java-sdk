// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasAdminConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasAdminConfigResponseBodyResultContent resultContent;

    public static GetHasAdminConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasAdminConfigResponseBody self = new GetHasAdminConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasAdminConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasAdminConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasAdminConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasAdminConfigResponseBody setResultContent(GetHasAdminConfigResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasAdminConfigResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasAdminConfigResponseBodyResultContentData extends TeaModel {
        @NameInMap("CellId")
        public String cellId;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("ConfigType")
        public Long configType;

        @NameInMap("Id")
        public String id;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Value")
        public String value;

        public static GetHasAdminConfigResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasAdminConfigResponseBodyResultContentData self = new GetHasAdminConfigResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasAdminConfigResponseBodyResultContentData setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public GetHasAdminConfigResponseBodyResultContentData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public GetHasAdminConfigResponseBodyResultContentData setConfigType(Long configType) {
            this.configType = configType;
            return this;
        }
        public Long getConfigType() {
            return this.configType;
        }

        public GetHasAdminConfigResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasAdminConfigResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public GetHasAdminConfigResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetHasAdminConfigResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasAdminConfigResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasAdminConfigResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasAdminConfigResponseBodyResultContentData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetHasAdminConfigResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasAdminConfigResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasAdminConfigResponseBodyResultContentTopErrorCode self = new GetHasAdminConfigResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasAdminConfigResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasAdminConfigResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasAdminConfigResponseBodyResultContentTopErrorReason self = new GetHasAdminConfigResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasAdminConfigResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasAdminConfigResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasAdminConfigResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasAdminConfigResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasAdminConfigResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasAdminConfigResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasAdminConfigResponseBodyResultContent self = new GetHasAdminConfigResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasAdminConfigResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasAdminConfigResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasAdminConfigResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasAdminConfigResponseBodyResultContent setData(GetHasAdminConfigResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasAdminConfigResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasAdminConfigResponseBodyResultContent setTopErrorCode(GetHasAdminConfigResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasAdminConfigResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasAdminConfigResponseBodyResultContent setTopErrorReason(GetHasAdminConfigResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasAdminConfigResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
