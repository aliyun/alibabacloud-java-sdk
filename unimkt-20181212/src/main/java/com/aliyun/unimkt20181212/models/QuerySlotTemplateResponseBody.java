// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QuerySlotTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QuerySlotTemplateResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySlotTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotTemplateResponseBody self = new QuerySlotTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlotTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySlotTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySlotTemplateResponseBody setModel(QuerySlotTemplateResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QuerySlotTemplateResponseBodyModel getModel() {
        return this.model;
    }

    public QuerySlotTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlotTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySlotTemplateResponseBodyModel extends TeaModel {
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

        public static QuerySlotTemplateResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QuerySlotTemplateResponseBodyModel self = new QuerySlotTemplateResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplateDescription(String adSlotTemplateDescription) {
            this.adSlotTemplateDescription = adSlotTemplateDescription;
            return this;
        }
        public String getAdSlotTemplateDescription() {
            return this.adSlotTemplateDescription;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplateId(String adSlotTemplateId) {
            this.adSlotTemplateId = adSlotTemplateId;
            return this;
        }
        public String getAdSlotTemplateId() {
            return this.adSlotTemplateId;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplateName(String adSlotTemplateName) {
            this.adSlotTemplateName = adSlotTemplateName;
            return this;
        }
        public String getAdSlotTemplateName() {
            return this.adSlotTemplateName;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplatePic(String adSlotTemplatePic) {
            this.adSlotTemplatePic = adSlotTemplatePic;
            return this;
        }
        public String getAdSlotTemplatePic() {
            return this.adSlotTemplatePic;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplatePreview(String adSlotTemplatePreview) {
            this.adSlotTemplatePreview = adSlotTemplatePreview;
            return this;
        }
        public String getAdSlotTemplatePreview() {
            return this.adSlotTemplatePreview;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotTemplateTitle(String adSlotTemplateTitle) {
            this.adSlotTemplateTitle = adSlotTemplateTitle;
            return this;
        }
        public String getAdSlotTemplateTitle() {
            return this.adSlotTemplateTitle;
        }

        public QuerySlotTemplateResponseBodyModel setAdSlotType(String adSlotType) {
            this.adSlotType = adSlotType;
            return this;
        }
        public String getAdSlotType() {
            return this.adSlotType;
        }

        public QuerySlotTemplateResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QuerySlotTemplateResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QuerySlotTemplateResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QuerySlotTemplateResponseBodyModel setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public QuerySlotTemplateResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QuerySlotTemplateResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
