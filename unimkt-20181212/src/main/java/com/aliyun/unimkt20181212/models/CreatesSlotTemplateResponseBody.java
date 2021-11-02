// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreatesSlotTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreatesSlotTemplateResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreatesSlotTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatesSlotTemplateResponseBody self = new CreatesSlotTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatesSlotTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatesSlotTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatesSlotTemplateResponseBody setModel(CreatesSlotTemplateResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreatesSlotTemplateResponseBodyModel getModel() {
        return this.model;
    }

    public CreatesSlotTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatesSlotTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatesSlotTemplateResponseBodyModel extends TeaModel {
        @NameInMap("AdSlotTemplateDescription")
        public String adSlotTemplateDescription;

        @NameInMap("AdSlotTemplateId")
        public String adSlotTemplateId;

        @NameInMap("AdSlotTemplateName")
        public String adSlotTemplateName;

        @NameInMap("AdSlotTemplatePic")
        public String adSlotTemplatePic;

        @NameInMap("AdSlotTemplatePreview")
        public String adSlotTemplatePreview;

        @NameInMap("AdSlotTemplateTitle")
        public String adSlotTemplateTitle;

        @NameInMap("AdSlotType")
        public String adSlotType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static CreatesSlotTemplateResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreatesSlotTemplateResponseBodyModel self = new CreatesSlotTemplateResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplateDescription(String adSlotTemplateDescription) {
            this.adSlotTemplateDescription = adSlotTemplateDescription;
            return this;
        }
        public String getAdSlotTemplateDescription() {
            return this.adSlotTemplateDescription;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplateId(String adSlotTemplateId) {
            this.adSlotTemplateId = adSlotTemplateId;
            return this;
        }
        public String getAdSlotTemplateId() {
            return this.adSlotTemplateId;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplateName(String adSlotTemplateName) {
            this.adSlotTemplateName = adSlotTemplateName;
            return this;
        }
        public String getAdSlotTemplateName() {
            return this.adSlotTemplateName;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplatePic(String adSlotTemplatePic) {
            this.adSlotTemplatePic = adSlotTemplatePic;
            return this;
        }
        public String getAdSlotTemplatePic() {
            return this.adSlotTemplatePic;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplatePreview(String adSlotTemplatePreview) {
            this.adSlotTemplatePreview = adSlotTemplatePreview;
            return this;
        }
        public String getAdSlotTemplatePreview() {
            return this.adSlotTemplatePreview;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotTemplateTitle(String adSlotTemplateTitle) {
            this.adSlotTemplateTitle = adSlotTemplateTitle;
            return this;
        }
        public String getAdSlotTemplateTitle() {
            return this.adSlotTemplateTitle;
        }

        public CreatesSlotTemplateResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public CreatesSlotTemplateResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreatesSlotTemplateResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CreatesSlotTemplateResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreatesSlotTemplateResponseBodyModel setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public CreatesSlotTemplateResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreatesSlotTemplateResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
