// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTotalcountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewTotalcountResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewTotalcountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTotalcountResponseBody self = new QueryHasLocaloverviewTotalcountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTotalcountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewTotalcountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewTotalcountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewTotalcountResponseBody setResultContent(QueryHasLocaloverviewTotalcountResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewTotalcountResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewTotalcountResponseBodyResultContentData extends TeaModel {
        @NameInMap("DiagnosisSceneCount")
        public Long diagnosisSceneCount;

        @NameInMap("EmergencyPlanCount")
        public Long emergencyPlanCount;

        @NameInMap("ExperimentSpecCount")
        public Long experimentSpecCount;

        @NameInMap("InspectProdExistCount")
        public Long inspectProdExistCount;

        @NameInMap("InspectRuleCount")
        public Long inspectRuleCount;

        @NameInMap("ProductTotalCount")
        public Long productTotalCount;

        @NameInMap("RiskHandledCount")
        public Long riskHandledCount;

        @NameInMap("RiskTotalCount")
        public Long riskTotalCount;

        public static QueryHasLocaloverviewTotalcountResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTotalcountResponseBodyResultContentData self = new QueryHasLocaloverviewTotalcountResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setDiagnosisSceneCount(Long diagnosisSceneCount) {
            this.diagnosisSceneCount = diagnosisSceneCount;
            return this;
        }
        public Long getDiagnosisSceneCount() {
            return this.diagnosisSceneCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setEmergencyPlanCount(Long emergencyPlanCount) {
            this.emergencyPlanCount = emergencyPlanCount;
            return this;
        }
        public Long getEmergencyPlanCount() {
            return this.emergencyPlanCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setExperimentSpecCount(Long experimentSpecCount) {
            this.experimentSpecCount = experimentSpecCount;
            return this;
        }
        public Long getExperimentSpecCount() {
            return this.experimentSpecCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setInspectProdExistCount(Long inspectProdExistCount) {
            this.inspectProdExistCount = inspectProdExistCount;
            return this;
        }
        public Long getInspectProdExistCount() {
            return this.inspectProdExistCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setInspectRuleCount(Long inspectRuleCount) {
            this.inspectRuleCount = inspectRuleCount;
            return this;
        }
        public Long getInspectRuleCount() {
            return this.inspectRuleCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setProductTotalCount(Long productTotalCount) {
            this.productTotalCount = productTotalCount;
            return this;
        }
        public Long getProductTotalCount() {
            return this.productTotalCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setRiskHandledCount(Long riskHandledCount) {
            this.riskHandledCount = riskHandledCount;
            return this;
        }
        public Long getRiskHandledCount() {
            return this.riskHandledCount;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData setRiskTotalCount(Long riskTotalCount) {
            this.riskTotalCount = riskTotalCount;
            return this;
        }
        public Long getRiskTotalCount() {
            return this.riskTotalCount;
        }

    }

    public static class QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewTotalcountResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewTotalcountResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTotalcountResponseBodyResultContent self = new QueryHasLocaloverviewTotalcountResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setData(QueryHasLocaloverviewTotalcountResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewTotalcountResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewTotalcountResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
