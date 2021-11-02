// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifySlotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifySlotResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySlotResponseBody self = new ModifySlotResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySlotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySlotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySlotResponseBody setModel(ModifySlotResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifySlotResponseBodyModel getModel() {
        return this.model;
    }

    public ModifySlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySlotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifySlotResponseBodyModel extends TeaModel {
        @NameInMap("AdSlotCorporateStatus")
        public String adSlotCorporateStatus;

        @NameInMap("AdSlotId")
        public String adSlotId;

        @NameInMap("AdSlotName")
        public String adSlotName;

        @NameInMap("AdSlotStatus")
        public String adSlotStatus;

        @NameInMap("AdSlotTemplateId")
        public String adSlotTemplateId;

        @NameInMap("AdSlotType")
        public String adSlotType;

        @NameInMap("BlockingRule")
        public String blockingRule;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("InspireScene")
        public String inspireScene;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static ModifySlotResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifySlotResponseBodyModel self = new ModifySlotResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifySlotResponseBodyModel setAdSlotCorporateStatus(String adSlotCorporateStatus) {
            this.adSlotCorporateStatus = adSlotCorporateStatus;
            return this;
        }
        public String getAdSlotCorporateStatus() {
            return this.adSlotCorporateStatus;
        }

        public ModifySlotResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public ModifySlotResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public ModifySlotResponseBodyModel setAdSlotStatus(String adSlotStatus) {
            this.adSlotStatus = adSlotStatus;
            return this;
        }
        public String getAdSlotStatus() {
            return this.adSlotStatus;
        }

        public ModifySlotResponseBodyModel setAdSlotTemplateId(String adSlotTemplateId) {
            this.adSlotTemplateId = adSlotTemplateId;
            return this;
        }
        public String getAdSlotTemplateId() {
            return this.adSlotTemplateId;
        }

        public ModifySlotResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public ModifySlotResponseBodyModel setBlockingRule(String blockingRule) {
            this.blockingRule = blockingRule;
            return this;
        }
        public String getBlockingRule() {
            return this.blockingRule;
        }

        public ModifySlotResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifySlotResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ModifySlotResponseBodyModel setInspireScene(String inspireScene) {
            this.inspireScene = inspireScene;
            return this;
        }
        public String getInspireScene() {
            return this.inspireScene;
        }

        public ModifySlotResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ModifySlotResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ModifySlotResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ModifySlotResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifySlotResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
