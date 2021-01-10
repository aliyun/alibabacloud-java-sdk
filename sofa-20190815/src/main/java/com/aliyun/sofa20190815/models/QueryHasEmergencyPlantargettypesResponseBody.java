// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasEmergencyPlantargettypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasEmergencyPlantargettypesResponseBodyResultContent resultContent;

    public static QueryHasEmergencyPlantargettypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasEmergencyPlantargettypesResponseBody self = new QueryHasEmergencyPlantargettypesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasEmergencyPlantargettypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasEmergencyPlantargettypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasEmergencyPlantargettypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasEmergencyPlantargettypesResponseBody setResultContent(QueryHasEmergencyPlantargettypesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasEmergencyPlantargettypesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasEmergencyPlantargettypesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasEmergencyPlantargettypesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlantargettypesResponseBodyResultContentData self = new QueryHasEmergencyPlantargettypesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode self = new QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason self = new QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasEmergencyPlantargettypesResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasEmergencyPlantargettypesResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasEmergencyPlantargettypesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasEmergencyPlantargettypesResponseBodyResultContent self = new QueryHasEmergencyPlantargettypesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setData(java.util.List<QueryHasEmergencyPlantargettypesResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasEmergencyPlantargettypesResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setTopErrorCode(QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasEmergencyPlantargettypesResponseBodyResultContent setTopErrorReason(QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasEmergencyPlantargettypesResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
