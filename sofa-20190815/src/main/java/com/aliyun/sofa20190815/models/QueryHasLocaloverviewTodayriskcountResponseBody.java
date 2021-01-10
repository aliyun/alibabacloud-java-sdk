// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayriskcountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewTodayriskcountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayriskcountResponseBody self = new QueryHasLocaloverviewTodayriskcountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayriskcountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewTodayriskcountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewTodayriskcountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewTodayriskcountResponseBody setResultContent(QueryHasLocaloverviewTodayriskcountResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData extends TeaModel {
        @NameInMap("CountTotal")
        public Long countTotal;

        @NameInMap("CountOn")
        public Long countOn;

        @NameInMap("CountProcessing")
        public Long countProcessing;

        @NameInMap("CountResolved")
        public Long countResolved;

        @NameInMap("CountOff")
        public Long countOff;

        @NameInMap("CountP0")
        public Long countP0;

        @NameInMap("CountP1")
        public Long countP1;

        @NameInMap("CountP2")
        public Long countP2;

        @NameInMap("CountInfo")
        public Long countInfo;

        public static QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData self = new QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountTotal(Long countTotal) {
            this.countTotal = countTotal;
            return this;
        }
        public Long getCountTotal() {
            return this.countTotal;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountOn(Long countOn) {
            this.countOn = countOn;
            return this;
        }
        public Long getCountOn() {
            return this.countOn;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountProcessing(Long countProcessing) {
            this.countProcessing = countProcessing;
            return this;
        }
        public Long getCountProcessing() {
            return this.countProcessing;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountResolved(Long countResolved) {
            this.countResolved = countResolved;
            return this;
        }
        public Long getCountResolved() {
            return this.countResolved;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountOff(Long countOff) {
            this.countOff = countOff;
            return this;
        }
        public Long getCountOff() {
            return this.countOff;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountP0(Long countP0) {
            this.countP0 = countP0;
            return this;
        }
        public Long getCountP0() {
            return this.countP0;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountP1(Long countP1) {
            this.countP1 = countP1;
            return this;
        }
        public Long getCountP1() {
            return this.countP1;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountP2(Long countP2) {
            this.countP2 = countP2;
            return this;
        }
        public Long getCountP2() {
            return this.countP2;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData setCountInfo(Long countInfo) {
            this.countInfo = countInfo;
            return this;
        }
        public Long getCountInfo() {
            return this.countInfo;
        }

    }

    public static class QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewTodayriskcountResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewTodayriskcountResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayriskcountResponseBodyResultContent self = new QueryHasLocaloverviewTodayriskcountResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setData(QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewTodayriskcountResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
