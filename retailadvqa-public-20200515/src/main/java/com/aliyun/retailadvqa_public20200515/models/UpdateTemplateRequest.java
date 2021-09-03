// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    // 主键
    @NameInMap("Id")
    public String id;

    // 模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 模板内容
    @NameInMap("TemplateContent")
    public String templateContent;

    // 短信模板申请说明
    @NameInMap("Remark")
    public String remark;

    // 短信类型
    @NameInMap("TemplateType")
    public Long templateType;

    // 平台类型，用逗号分隔
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

    // 组织id
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public UpdateTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateTemplateRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

    public UpdateTemplateRequest setPlatformIds(String platformIds) {
        this.platformIds = platformIds;
        return this;
    }
    public String getPlatformIds() {
        return this.platformIds;
    }

    public UpdateTemplateRequest setComefrom(String comefrom) {
        this.comefrom = comefrom;
        return this;
    }
    public String getComefrom() {
        return this.comefrom;
    }

    public UpdateTemplateRequest setIsVariable(Long isVariable) {
        this.isVariable = isVariable;
        return this;
    }
    public Long getIsVariable() {
        return this.isVariable;
    }

    public UpdateTemplateRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public UpdateTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
