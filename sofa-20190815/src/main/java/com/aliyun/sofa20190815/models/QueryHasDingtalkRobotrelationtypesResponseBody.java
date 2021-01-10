// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotrelationtypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent resultContent;

    public static QueryHasDingtalkRobotrelationtypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotrelationtypesResponseBody self = new QueryHasDingtalkRobotrelationtypesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotrelationtypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDingtalkRobotrelationtypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDingtalkRobotrelationtypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDingtalkRobotrelationtypesResponseBody setResultContent(QueryHasDingtalkRobotrelationtypesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData self = new QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode self = new QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason self = new QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDingtalkRobotrelationtypesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDingtalkRobotrelationtypesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationtypesResponseBodyResultContent self = new QueryHasDingtalkRobotrelationtypesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setData(java.util.List<QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDingtalkRobotrelationtypesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setTopErrorCode(QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContent setTopErrorReason(QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDingtalkRobotrelationtypesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
