// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectSingledayreportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectSingledayreportResponseBodyResultContent resultContent;

    public static ListHasInspectSingledayreportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectSingledayreportResponseBody self = new ListHasInspectSingledayreportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectSingledayreportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectSingledayreportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectSingledayreportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectSingledayreportResponseBody setResultContent(ListHasInspectSingledayreportResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectSingledayreportResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectSingledayreportResponseBodyResultContentData extends TeaModel {
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SuccessRate")
        public String successRate;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ExecutionSum")
        public Long executionSum;

        @NameInMap("VerdictPassSum")
        public Long verdictPassSum;

        public static ListHasInspectSingledayreportResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectSingledayreportResponseBodyResultContentData self = new ListHasInspectSingledayreportResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectSingledayreportResponseBodyResultContentData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentData setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentData setExecutionSum(Long executionSum) {
            this.executionSum = executionSum;
            return this;
        }
        public Long getExecutionSum() {
            return this.executionSum;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentData setVerdictPassSum(Long verdictPassSum) {
            this.verdictPassSum = verdictPassSum;
            return this;
        }
        public Long getVerdictPassSum() {
            return this.verdictPassSum;
        }

    }

    public static class ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode self = new ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason self = new ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectSingledayreportResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectSingledayreportResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectSingledayreportResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectSingledayreportResponseBodyResultContent self = new ListHasInspectSingledayreportResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setData(java.util.List<ListHasInspectSingledayreportResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectSingledayreportResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setTopErrorCode(ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectSingledayreportResponseBodyResultContent setTopErrorReason(ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectSingledayreportResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
