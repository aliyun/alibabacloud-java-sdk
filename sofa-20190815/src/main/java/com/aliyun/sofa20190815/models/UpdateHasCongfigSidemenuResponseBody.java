// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCongfigSidemenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasCongfigSidemenuResponseBodyResultContent resultContent;

    public static UpdateHasCongfigSidemenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCongfigSidemenuResponseBody self = new UpdateHasCongfigSidemenuResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasCongfigSidemenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasCongfigSidemenuResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasCongfigSidemenuResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasCongfigSidemenuResponseBody setResultContent(UpdateHasCongfigSidemenuResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasCongfigSidemenuResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasCongfigSidemenuResponseBodyResultContentData extends TeaModel {
        @NameInMap("YunYouGlobalHost")
        public String yunYouGlobalHost;

        @NameInMap("SiderMenu")
        public java.util.List<String> siderMenu;

        public static UpdateHasCongfigSidemenuResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCongfigSidemenuResponseBodyResultContentData self = new UpdateHasCongfigSidemenuResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentData setYunYouGlobalHost(String yunYouGlobalHost) {
            this.yunYouGlobalHost = yunYouGlobalHost;
            return this;
        }
        public String getYunYouGlobalHost() {
            return this.yunYouGlobalHost;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentData setSiderMenu(java.util.List<String> siderMenu) {
            this.siderMenu = siderMenu;
            return this;
        }
        public java.util.List<String> getSiderMenu() {
            return this.siderMenu;
        }

    }

    public static class UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode self = new UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason self = new UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasCongfigSidemenuResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public UpdateHasCongfigSidemenuResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasCongfigSidemenuResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasCongfigSidemenuResponseBodyResultContent self = new UpdateHasCongfigSidemenuResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setData(UpdateHasCongfigSidemenuResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public UpdateHasCongfigSidemenuResponseBodyResultContentData getData() {
            return this.data;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setTopErrorCode(UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasCongfigSidemenuResponseBodyResultContent setTopErrorReason(UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasCongfigSidemenuResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
