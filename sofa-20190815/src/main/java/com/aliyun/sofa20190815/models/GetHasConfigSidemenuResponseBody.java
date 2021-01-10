// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasConfigSidemenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasConfigSidemenuResponseBodyResultContent resultContent;

    public static GetHasConfigSidemenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasConfigSidemenuResponseBody self = new GetHasConfigSidemenuResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasConfigSidemenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasConfigSidemenuResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasConfigSidemenuResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasConfigSidemenuResponseBody setResultContent(GetHasConfigSidemenuResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasConfigSidemenuResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasConfigSidemenuResponseBodyResultContentData extends TeaModel {
        @NameInMap("YunYouGlobalHost")
        public String yunYouGlobalHost;

        @NameInMap("SiderMenu")
        public java.util.List<String> siderMenu;

        public static GetHasConfigSidemenuResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSidemenuResponseBodyResultContentData self = new GetHasConfigSidemenuResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSidemenuResponseBodyResultContentData setYunYouGlobalHost(String yunYouGlobalHost) {
            this.yunYouGlobalHost = yunYouGlobalHost;
            return this;
        }
        public String getYunYouGlobalHost() {
            return this.yunYouGlobalHost;
        }

        public GetHasConfigSidemenuResponseBodyResultContentData setSiderMenu(java.util.List<String> siderMenu) {
            this.siderMenu = siderMenu;
            return this;
        }
        public java.util.List<String> getSiderMenu() {
            return this.siderMenu;
        }

    }

    public static class GetHasConfigSidemenuResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasConfigSidemenuResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSidemenuResponseBodyResultContentTopErrorCode self = new GetHasConfigSidemenuResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasConfigSidemenuResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasConfigSidemenuResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSidemenuResponseBodyResultContentTopErrorReason self = new GetHasConfigSidemenuResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasConfigSidemenuResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasConfigSidemenuResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasConfigSidemenuResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasConfigSidemenuResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasConfigSidemenuResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSidemenuResponseBodyResultContent self = new GetHasConfigSidemenuResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSidemenuResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasConfigSidemenuResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasConfigSidemenuResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasConfigSidemenuResponseBodyResultContent setData(GetHasConfigSidemenuResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasConfigSidemenuResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasConfigSidemenuResponseBodyResultContent setTopErrorCode(GetHasConfigSidemenuResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasConfigSidemenuResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasConfigSidemenuResponseBodyResultContent setTopErrorReason(GetHasConfigSidemenuResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasConfigSidemenuResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
