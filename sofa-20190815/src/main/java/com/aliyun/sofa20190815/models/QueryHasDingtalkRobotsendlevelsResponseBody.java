// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotsendlevelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent resultContent;

    public static QueryHasDingtalkRobotsendlevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotsendlevelsResponseBody self = new QueryHasDingtalkRobotsendlevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotsendlevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDingtalkRobotsendlevelsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDingtalkRobotsendlevelsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDingtalkRobotsendlevelsResponseBody setResultContent(QueryHasDingtalkRobotsendlevelsResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public Long level;

        @NameInMap("Description")
        public String description;

        public static QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData self = new QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode self = new QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason self = new QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDingtalkRobotsendlevelsResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDingtalkRobotsendlevelsResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotsendlevelsResponseBodyResultContent self = new QueryHasDingtalkRobotsendlevelsResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setData(java.util.List<QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDingtalkRobotsendlevelsResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setTopErrorCode(QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContent setTopErrorReason(QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDingtalkRobotsendlevelsResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
