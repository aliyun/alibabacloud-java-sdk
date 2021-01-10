// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectRulesetdetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectRulesetdetailResponseBodyResultContent resultContent;

    public static GetHasInspectRulesetdetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectRulesetdetailResponseBody self = new GetHasInspectRulesetdetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectRulesetdetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectRulesetdetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectRulesetdetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectRulesetdetailResponseBody setResultContent(GetHasInspectRulesetdetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectRulesetdetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectRulesetdetailResponseBodyResultContentDataTags extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetHasInspectRulesetdetailResponseBodyResultContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectRulesetdetailResponseBodyResultContentDataTags self = new GetHasInspectRulesetdetailResponseBodyResultContentDataTags();
            return TeaModel.build(map, self);
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentDataTags setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentDataTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetHasInspectRulesetdetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("RuleSetType")
        public String ruleSetType;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Tags")
        public java.util.List<GetHasInspectRulesetdetailResponseBodyResultContentDataTags> tags;

        public static GetHasInspectRulesetdetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectRulesetdetailResponseBodyResultContentData self = new GetHasInspectRulesetdetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setRuleSetType(String ruleSetType) {
            this.ruleSetType = ruleSetType;
            return this;
        }
        public String getRuleSetType() {
            return this.ruleSetType;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentData setTags(java.util.List<GetHasInspectRulesetdetailResponseBodyResultContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetHasInspectRulesetdetailResponseBodyResultContentDataTags> getTags() {
            return this.tags;
        }

    }

    public static class GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode self = new GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason self = new GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectRulesetdetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectRulesetdetailResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectRulesetdetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectRulesetdetailResponseBodyResultContent self = new GetHasInspectRulesetdetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setData(GetHasInspectRulesetdetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectRulesetdetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setTopErrorCode(GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectRulesetdetailResponseBodyResultContent setTopErrorReason(GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectRulesetdetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
