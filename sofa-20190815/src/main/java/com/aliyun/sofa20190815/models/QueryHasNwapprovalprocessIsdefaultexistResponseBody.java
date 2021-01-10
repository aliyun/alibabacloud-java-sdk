// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasNwapprovalprocessIsdefaultexistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent resultContent;

    public static QueryHasNwapprovalprocessIsdefaultexistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasNwapprovalprocessIsdefaultexistResponseBody self = new QueryHasNwapprovalprocessIsdefaultexistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponseBody setResultContent(QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode self = new QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason self = new QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("TopErrorCode")
        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent self = new QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setTopErrorCode(QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContent setTopErrorReason(QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasNwapprovalprocessIsdefaultexistResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
