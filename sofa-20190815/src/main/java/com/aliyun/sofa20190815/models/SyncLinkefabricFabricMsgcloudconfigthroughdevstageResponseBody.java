// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData> data;

    public static SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody self = new SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBody setData(java.util.List<SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData> getData() {
        return this.data;
    }

    public static class SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Description")
        public String description;

        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("Env")
        public String env;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("TagType")
        public String tagType;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("VersionId")
        public Long versionId;

        public static SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData self = new SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
