// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasConfigSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasConfigSwitchResponseBodyResultContent resultContent;

    public static QueryHasConfigSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasConfigSwitchResponseBody self = new QueryHasConfigSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasConfigSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasConfigSwitchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasConfigSwitchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasConfigSwitchResponseBody setResultContent(QueryHasConfigSwitchResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasConfigSwitchResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasConfigSwitchResponseBodyResultContentData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Maker")
        public String maker;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Value")
        public Boolean value;

        public static QueryHasConfigSwitchResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSwitchResponseBodyResultContentData self = new QueryHasConfigSwitchResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSwitchResponseBodyResultContentData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryHasConfigSwitchResponseBodyResultContentData setMaker(String maker) {
            this.maker = maker;
            return this;
        }
        public String getMaker() {
            return this.maker;
        }

        public QueryHasConfigSwitchResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasConfigSwitchResponseBodyResultContentData setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

    public static class QueryHasConfigSwitchResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasConfigSwitchResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSwitchResponseBodyResultContentTopErrorCode self = new QueryHasConfigSwitchResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasConfigSwitchResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasConfigSwitchResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSwitchResponseBodyResultContentTopErrorReason self = new QueryHasConfigSwitchResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasConfigSwitchResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasConfigSwitchResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasConfigSwitchResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasConfigSwitchResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasConfigSwitchResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSwitchResponseBodyResultContent self = new QueryHasConfigSwitchResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSwitchResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasConfigSwitchResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasConfigSwitchResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasConfigSwitchResponseBodyResultContent setData(java.util.List<QueryHasConfigSwitchResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasConfigSwitchResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasConfigSwitchResponseBodyResultContent setTopErrorCode(QueryHasConfigSwitchResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasConfigSwitchResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasConfigSwitchResponseBodyResultContent setTopErrorReason(QueryHasConfigSwitchResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasConfigSwitchResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
