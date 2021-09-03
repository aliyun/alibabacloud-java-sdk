// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    // 模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 模板内容
    @NameInMap("TemplateContent")
    public String templateContent;

    // 短信模板申请说明
    @NameInMap("Remark")
    public String remark;

    // 模板类型
    @NameInMap("TemplateType")
    public Long templateType;

    // 平台ID，多个平台英文逗号分隔
    @NameInMap("PlatformIds")
    public String platformIds;

    // 模板来源
    @NameInMap("Comefrom")
    public String comefrom;

    // 是否为变量短信
    @NameInMap("IsVariable")
    public Long isVariable;

    // oem code
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateRequest self = new AddTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public AddTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddTemplateRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public AddTemplateRequest setPlatformIds(String platformIds) {
        this.platformIds = platformIds;
        return this;
    }
    public String getPlatformIds() {
        return this.platformIds;
    }

    public AddTemplateRequest setComefrom(String comefrom) {
        this.comefrom = comefrom;
        return this;
    }
    public String getComefrom() {
        return this.comefrom;
    }

    public AddTemplateRequest setIsVariable(Long isVariable) {
        this.isVariable = isVariable;
        return this;
    }
    public Long getIsVariable() {
        return this.isVariable;
    }

    public AddTemplateRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public AddTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
