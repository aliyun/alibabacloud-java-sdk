// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasmetadataproviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent resultContent;

    public static QueryHasCloudarchIaasmetadataproviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasmetadataproviderResponseBody self = new QueryHasCloudarchIaasmetadataproviderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasmetadataproviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchIaasmetadataproviderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchIaasmetadataproviderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchIaasmetadataproviderResponseBody setResultContent(QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData self = new QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent self = new QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setData(java.util.List<QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setTopErrorCode(QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContent setTopErrorReason(QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchIaasmetadataproviderResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
