// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayinspectmissioncountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewTodayinspectmissioncountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayinspectmissioncountResponseBody self = new QueryHasLocaloverviewTodayinspectmissioncountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayinspectmissioncountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewTodayinspectmissioncountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewTodayinspectmissioncountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewTodayinspectmissioncountResponseBody setResultContent(QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData extends TeaModel {
        @NameInMap("CountPlan")
        public Long countPlan;

        @NameInMap("CountExecuted")
        public Long countExecuted;

        public static QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData self = new QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData setCountPlan(Long countPlan) {
            this.countPlan = countPlan;
            return this;
        }
        public Long getCountPlan() {
            return this.countPlan;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData setCountExecuted(Long countExecuted) {
            this.countExecuted = countExecuted;
            return this;
        }
        public Long getCountExecuted() {
            return this.countExecuted;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent self = new QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setData(QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewTodayinspectmissioncountResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
