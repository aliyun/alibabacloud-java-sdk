// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewEverydayriskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewEverydayriskResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewEverydayriskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewEverydayriskResponseBody self = new QueryHasLocaloverviewEverydayriskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewEverydayriskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewEverydayriskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewEverydayriskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewEverydayriskResponseBody setResultContent(QueryHasLocaloverviewEverydayriskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewEverydayriskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewEverydayriskResponseBodyResultContentData extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Count")
        public Long count;

        public static QueryHasLocaloverviewEverydayriskResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewEverydayriskResponseBodyResultContentData self = new QueryHasLocaloverviewEverydayriskResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentData setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewEverydayriskResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasLocaloverviewEverydayriskResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewEverydayriskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewEverydayriskResponseBodyResultContent self = new QueryHasLocaloverviewEverydayriskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setData(java.util.List<QueryHasLocaloverviewEverydayriskResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasLocaloverviewEverydayriskResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewEverydayriskResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewEverydayriskResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
