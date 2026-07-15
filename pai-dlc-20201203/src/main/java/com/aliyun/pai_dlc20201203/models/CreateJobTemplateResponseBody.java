// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The default version number of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultVersion")
    public Integer defaultVersion;

    /**
     * <p>The description of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>Template description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The creation time of the job template.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-31T02:18:09Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modification time of the job template.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>User-defined key-value metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>The ID of the request, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>8762921A-911C-515F-A3A4-*********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>tplmceolmf2****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>job-template-example-1778047****</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The ID of the tenant that contains the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>10**************14</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the user who created the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>20**************02</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The version number of the created job template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>The ID of the workspace that contains the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>15****05</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponseBody self = new CreateJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponseBody setDefaultVersion(Integer defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    public CreateJobTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobTemplateResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public CreateJobTemplateResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public CreateJobTemplateResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateJobTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateJobTemplateResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateJobTemplateResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateJobTemplateResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public CreateJobTemplateResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
