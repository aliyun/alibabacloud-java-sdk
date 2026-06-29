// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleTemplate extends TeaModel {
    /**
     * <p>Reasons for template deprecation</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;无效&quot;]</p>
     */
    @NameInMap("AbandonReasons")
    public String abandonReasons;

    /**
     * <p>Template description</p>
     * 
     * <strong>example:</strong>
     * <p>图片分割的模板</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Creation Time</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 14:21:08</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Update Time</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12 14:21:08</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Is shared</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("SharedMode")
    public String sharedMode;

    /**
     * <p>Status</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>List of tags</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>154***1431673270272</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Template Name</p>
     * 
     * <strong>example:</strong>
     * <p>图片分割组合77aa</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Tenant ID of the template</p>
     * 
     * <strong>example:</strong>
     * <p>GA***W134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Type</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("Type")
    public String type;

    public static SimpleTemplate build(java.util.Map<String, ?> map) throws Exception {
        SimpleTemplate self = new SimpleTemplate();
        return TeaModel.build(map, self);
    }

    public SimpleTemplate setAbandonReasons(String abandonReasons) {
        this.abandonReasons = abandonReasons;
        return this;
    }
    public String getAbandonReasons() {
        return this.abandonReasons;
    }

    public SimpleTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SimpleTemplate setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public SimpleTemplate setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public SimpleTemplate setSharedMode(String sharedMode) {
        this.sharedMode = sharedMode;
        return this;
    }
    public String getSharedMode() {
        return this.sharedMode;
    }

    public SimpleTemplate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SimpleTemplate setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public SimpleTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SimpleTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SimpleTemplate setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SimpleTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
