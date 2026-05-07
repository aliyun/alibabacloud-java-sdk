// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateResponseBody extends TeaModel {
    /**
     * <p>当前默认使用的版本号</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DefaultVersion")
    public Integer defaultVersion;

    /**
     * <strong>example:</strong>
     * <p>job template description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-08T14:17:55Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-03T05:48:02Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>20**************26</p>
     */
    @NameInMap("ModifiedBy")
    public String modifiedBy;

    /**
     * <p>本次请求的 ID，用于诊断和答疑。</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>tplmceolmf2****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>job-template-example-1778047****</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>142388383837****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>20**************26</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>模板版本详情列表。查询单个版本时返回1个元素，查询所有版本时返回全部</p>
     */
    @NameInMap("Versions")
    public java.util.List<GetJobTemplateResponseBodyVersions> versions;

    /**
     * <strong>example:</strong>
     * <p>4***9</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateResponseBody self = new GetJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateResponseBody setDefaultVersion(Integer defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    public GetJobTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetJobTemplateResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetJobTemplateResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public GetJobTemplateResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetJobTemplateResponseBody setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    public GetJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetJobTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetJobTemplateResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetJobTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetJobTemplateResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetJobTemplateResponseBody setVersions(java.util.List<GetJobTemplateResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<GetJobTemplateResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public GetJobTemplateResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetJobTemplateResponseBodyVersions extends TeaModel {
        /**
         * <p>字段约束规则。Key 为 JSONPath 表达式，Value 为约束类型</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;JobSpecs[0].Image\&quot;:\&quot;locked\&quot;,\&quot;UserCommand\&quot;:\&quot;locked\&quot;,\&quot;JobType\&quot;:\&quot;locked\&quot;}</p>
         */
        @NameInMap("Constraints")
        public java.util.Map<String, ?> constraints;

        /**
         * <p>该版本的模板配置内容，JSON 格式</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;WorkspaceId\&quot;:\&quot;15****05\&quot;,\&quot;JobType\&quot;:\&quot;PyTorchJob\&quot;,\&quot;UserCommand\&quot;:\&quot;echo hello\&quot;,\&quot;JobSpecs\&quot;:[{\&quot;Type\&quot;:\&quot;Worker\&quot;,\&quot;PodCount\&quot;:1,\&quot;Image\&quot;:\&quot;dsw-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai/pytorch:2.8.0-gpu-py313-cu129-ubuntu22.04-3995b779-1764361782\&quot;,\&quot;EcsSpec\&quot;:\&quot;ecs.gn7i-c8g1.2xlarge\&quot;}],\&quot;ResourceType\&quot;:\&quot;ECS\&quot;,\&quot;_ResourcePaymentType\&quot;:\&quot;PostPaid\&quot;,\&quot;CredentialConfig\&quot;:{\&quot;EnableCredentialInject\&quot;:false},\&quot;Accessibility\&quot;:\&quot;PRIVATE\&quot;,\&quot;Settings\&quot;:{\&quot;JobReservedMinutes\&quot;:0,\&quot;Tags\&quot;:{}}}</p>
         */
        @NameInMap("Content")
        public Object content;

        /**
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-08T14:17:55Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetJobTemplateResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateResponseBodyVersions self = new GetJobTemplateResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateResponseBodyVersions setConstraints(java.util.Map<String, ?> constraints) {
            this.constraints = constraints;
            return this;
        }
        public java.util.Map<String, ?> getConstraints() {
            return this.constraints;
        }

        public GetJobTemplateResponseBodyVersions setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public GetJobTemplateResponseBodyVersions setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetJobTemplateResponseBodyVersions setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetJobTemplateResponseBodyVersions setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
