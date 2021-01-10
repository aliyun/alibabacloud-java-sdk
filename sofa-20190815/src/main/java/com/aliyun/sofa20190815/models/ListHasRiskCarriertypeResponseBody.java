// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasRiskCarriertypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasRiskCarriertypeResponseBodyResultContent resultContent;

    public static ListHasRiskCarriertypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasRiskCarriertypeResponseBody self = new ListHasRiskCarriertypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasRiskCarriertypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasRiskCarriertypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasRiskCarriertypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasRiskCarriertypeResponseBody setResultContent(ListHasRiskCarriertypeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasRiskCarriertypeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType build(java.util.Map<String, ?> map) throws Exception {
            ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType self = new ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType();
            return TeaModel.build(map, self);
        }

        public ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListHasRiskCarriertypeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("RiskTargetType")
        public ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType riskTargetType;

        public static ListHasRiskCarriertypeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasRiskCarriertypeResponseBodyResultContentData self = new ListHasRiskCarriertypeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasRiskCarriertypeResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentData setRiskTargetType(ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType riskTargetType) {
            this.riskTargetType = riskTargetType;
            return this;
        }
        public ListHasRiskCarriertypeResponseBodyResultContentDataRiskTargetType getRiskTargetType() {
            return this.riskTargetType;
        }

    }

    public static class ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode self = new ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason self = new ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasRiskCarriertypeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasRiskCarriertypeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasRiskCarriertypeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasRiskCarriertypeResponseBodyResultContent self = new ListHasRiskCarriertypeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setData(java.util.List<ListHasRiskCarriertypeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasRiskCarriertypeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setTopErrorCode(ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasRiskCarriertypeResponseBodyResultContent setTopErrorReason(ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasRiskCarriertypeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
