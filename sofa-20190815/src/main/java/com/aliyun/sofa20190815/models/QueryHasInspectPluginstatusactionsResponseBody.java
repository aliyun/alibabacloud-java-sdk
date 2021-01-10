// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPluginstatusactionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectPluginstatusactionsResponseBodyResultContent resultContent;

    public static QueryHasInspectPluginstatusactionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPluginstatusactionsResponseBody self = new QueryHasInspectPluginstatusactionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPluginstatusactionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectPluginstatusactionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectPluginstatusactionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectPluginstatusactionsResponseBody setResultContent(QueryHasInspectPluginstatusactionsResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectPluginstatusactionsResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions self = new QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus self = new QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContentData extends TeaModel {
        @NameInMap("AvailableActions")
        public java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions> availableActions;

        @NameInMap("Status")
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus status;

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContentData self = new QueryHasInspectPluginstatusactionsResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentData setAvailableActions(java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentData setStatus(QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus status) {
            this.status = status;
            return this;
        }
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentDataStatus getStatus() {
            return this.status;
        }

    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode self = new QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason self = new QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectPluginstatusactionsResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectPluginstatusactionsResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectPluginstatusactionsResponseBodyResultContent self = new QueryHasInspectPluginstatusactionsResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setData(java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectPluginstatusactionsResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setTopErrorCode(QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectPluginstatusactionsResponseBodyResultContent setTopErrorReason(QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectPluginstatusactionsResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
