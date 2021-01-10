// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectRulestatusactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ListHasInspectRulestatusactionResponseBodyResultContent resultContent;

    public static ListHasInspectRulestatusactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectRulestatusactionResponseBody self = new ListHasInspectRulestatusactionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectRulestatusactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectRulestatusactionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectRulestatusactionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectRulestatusactionResponseBody setResultContent(ListHasInspectRulestatusactionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListHasInspectRulestatusactionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions self = new ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContentDataStatus extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        public static ListHasInspectRulestatusactionResponseBodyResultContentDataStatus build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContentDataStatus self = new ListHasInspectRulestatusactionResponseBodyResultContentDataStatus();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentDataStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentDataStatus setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContentData extends TeaModel {
        @NameInMap("AvailableActions")
        public java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions> availableActions;

        @NameInMap("Status")
        public ListHasInspectRulestatusactionResponseBodyResultContentDataStatus status;

        public static ListHasInspectRulestatusactionResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContentData self = new ListHasInspectRulestatusactionResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentData setAvailableActions(java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions> availableActions) {
            this.availableActions = availableActions;
            return this;
        }
        public java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentDataAvailableActions> getAvailableActions() {
            return this.availableActions;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentData setStatus(ListHasInspectRulestatusactionResponseBodyResultContentDataStatus status) {
            this.status = status;
            return this;
        }
        public ListHasInspectRulestatusactionResponseBodyResultContentDataStatus getStatus() {
            return this.status;
        }

    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode self = new ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason self = new ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListHasInspectRulestatusactionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason topErrorReason;

        public static ListHasInspectRulestatusactionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRulestatusactionResponseBodyResultContent self = new ListHasInspectRulestatusactionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setData(java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHasInspectRulestatusactionResponseBodyResultContentData> getData() {
            return this.data;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setTopErrorCode(ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public ListHasInspectRulestatusactionResponseBodyResultContent setTopErrorReason(ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public ListHasInspectRulestatusactionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
