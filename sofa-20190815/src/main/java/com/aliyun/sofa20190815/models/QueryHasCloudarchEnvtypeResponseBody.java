// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchEnvtypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchEnvtypeResponseBodyResultContent resultContent;

    public static QueryHasCloudarchEnvtypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchEnvtypeResponseBody self = new QueryHasCloudarchEnvtypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchEnvtypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchEnvtypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchEnvtypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchEnvtypeResponseBody setResultContent(QueryHasCloudarchEnvtypeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchEnvtypeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchEnvtypeResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("YunyouCode")
        public String yunyouCode;

        public static QueryHasCloudarchEnvtypeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchEnvtypeResponseBodyResultContentData self = new QueryHasCloudarchEnvtypeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentData setYunyouCode(String yunyouCode) {
            this.yunyouCode = yunyouCode;
            return this;
        }
        public String getYunyouCode() {
            return this.yunyouCode;
        }

    }

    public static class QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchEnvtypeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasCloudarchEnvtypeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchEnvtypeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchEnvtypeResponseBodyResultContent self = new QueryHasCloudarchEnvtypeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setData(java.util.List<QueryHasCloudarchEnvtypeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchEnvtypeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setTopErrorCode(QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchEnvtypeResponseBodyResultContent setTopErrorReason(QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchEnvtypeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
