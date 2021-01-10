// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutNextstageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CheckLinkeBahamutNextstageResponseBodyResult result;

    public static CheckLinkeBahamutNextstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutNextstageResponseBody self = new CheckLinkeBahamutNextstageResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutNextstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutNextstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutNextstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutNextstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutNextstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutNextstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutNextstageResponseBody setResult(CheckLinkeBahamutNextstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutNextstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RuleKey")
        public String ruleKey;

        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("RuleName")
        public String ruleName;

        public static CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults self = new CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults setRuleKey(String ruleKey) {
            this.ruleKey = ruleKey;
            return this;
        }
        public String getRuleKey() {
            return this.ruleKey;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Description")
        public String description;

        @NameInMap("CheckResults")
        public java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults> checkResults;

        @NameInMap("Name")
        public String name;

        public static CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList self = new CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList setCheckResults(java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults> checkResults) {
            this.checkResults = checkResults;
            return this;
        }
        public java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultListCheckResults> getCheckResults() {
            return this.checkResults;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult extends TeaModel {
        @NameInMap("PassCount")
        public Long passCount;

        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("GuardCheckResultList")
        public java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList> guardCheckResultList;

        @NameInMap("Total")
        public Long total;

        public static CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult self = new CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult setPassCount(Long passCount) {
            this.passCount = passCount;
            return this;
        }
        public Long getPassCount() {
            return this.passCount;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult setGuardCheckResultList(java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList> guardCheckResultList) {
            this.guardCheckResultList = guardCheckResultList;
            return this;
        }
        public java.util.List<CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResultGuardCheckResultList> getGuardCheckResultList() {
            return this.guardCheckResultList;
        }

        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class CheckLinkeBahamutNextstageResponseBodyResult extends TeaModel {
        @NameInMap("BatchGuardCheckResult")
        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult batchGuardCheckResult;

        @NameInMap("WarnContent")
        public java.util.List<String> warnContent;

        @NameInMap("Content")
        public java.util.List<String> content;

        @NameInMap("Passed")
        public Boolean passed;

        public static CheckLinkeBahamutNextstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutNextstageResponseBodyResult self = new CheckLinkeBahamutNextstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutNextstageResponseBodyResult setBatchGuardCheckResult(CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult batchGuardCheckResult) {
            this.batchGuardCheckResult = batchGuardCheckResult;
            return this;
        }
        public CheckLinkeBahamutNextstageResponseBodyResultBatchGuardCheckResult getBatchGuardCheckResult() {
            return this.batchGuardCheckResult;
        }

        public CheckLinkeBahamutNextstageResponseBodyResult setWarnContent(java.util.List<String> warnContent) {
            this.warnContent = warnContent;
            return this;
        }
        public java.util.List<String> getWarnContent() {
            return this.warnContent;
        }

        public CheckLinkeBahamutNextstageResponseBodyResult setContent(java.util.List<String> content) {
            this.content = content;
            return this;
        }
        public java.util.List<String> getContent() {
            return this.content;
        }

        public CheckLinkeBahamutNextstageResponseBodyResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

    }

}
