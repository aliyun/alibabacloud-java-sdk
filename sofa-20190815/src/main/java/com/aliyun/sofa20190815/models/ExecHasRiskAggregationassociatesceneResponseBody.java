// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasRiskAggregationassociatesceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ExecHasRiskAggregationassociatesceneResponseBodyResultContent resultContent;

    public static ExecHasRiskAggregationassociatesceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecHasRiskAggregationassociatesceneResponseBody self = new ExecHasRiskAggregationassociatesceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecHasRiskAggregationassociatesceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecHasRiskAggregationassociatesceneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecHasRiskAggregationassociatesceneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecHasRiskAggregationassociatesceneResponseBody setResultContent(ExecHasRiskAggregationassociatesceneResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExecHasRiskAggregationassociatesceneResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode self = new ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason self = new ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExecHasRiskAggregationassociatesceneResponseBodyResultContent extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason topErrorReason;

        public static ExecHasRiskAggregationassociatesceneResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExecHasRiskAggregationassociatesceneResponseBodyResultContent self = new ExecHasRiskAggregationassociatesceneResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContent setTopErrorCode(ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecHasRiskAggregationassociatesceneResponseBodyResultContent setTopErrorReason(ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ExecHasRiskAggregationassociatesceneResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
