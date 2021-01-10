// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasCloudarchRegionResponseBodyResultContent resultContent;

    public static UpdateHasCloudarchRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchRegionResponseBody self = new UpdateHasCloudarchRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasCloudarchRegionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasCloudarchRegionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasCloudarchRegionResponseBody setResultContent(UpdateHasCloudarchRegionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasCloudarchRegionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode self = new UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason self = new UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasCloudarchRegionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasCloudarchRegionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCloudarchRegionResponseBodyResultContent self = new UpdateHasCloudarchRegionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasCloudarchRegionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContent setTopErrorCode(UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasCloudarchRegionResponseBodyResultContent setTopErrorReason(UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasCloudarchRegionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
