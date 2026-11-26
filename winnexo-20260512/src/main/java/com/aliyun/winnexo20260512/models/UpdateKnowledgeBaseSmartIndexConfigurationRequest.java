// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSmartIndexConfigurationRequest extends TeaModel {
    /**
     * <p>The platform application credential. Pass this parameter when using the application proxy mode, and specify the operator by using opsUserId or opsUserCode based on the application configuration. Do not use real credentials in logs or public examples.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The automatic execution schedule. Use a five-part cron expression where the minute field must be 0. For example, 0 2 * * * indicates execution at 02:00 every day based on the timezone. Omitting this parameter, setting it to null, or using a blank string indicates manual execution and clears the old automatic schedule, but does not disable the smart index. Maximum length: 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0 2 * * *</p>
     */
    @NameInMap("cronExpression")
    public String cronExpression;

    /**
     * <p>The business ID of the root directory for the standard enterprise knowledge base of the current tenant. You can obtain this ID from the response of the CreateTenantDirectory operation. You cannot use the internal primary key of the directory, or the IDs of personal spaces, group knowledge bases, subdirectories, or special knowledge bases.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to enable the LLM Wiki smart index. Valid values:</p>
     * <ul>
     * <li>true: Enabled. Switching from disabled to enabled creates an asynchronous full build task and a bill.</li>
     * <li>false: Disabled. If artifacts exist, asynchronous cleanup is initiated.
     * You cannot toggle the switch during task execution, and you cannot re-enable it until cleanup is complete.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The revision obtained from the most recent configuration read. This value must be a non-negative integer. The value is 0 when not configured, and increments by 1 after a successful save. If the version does not match, ERR.SmartIndex.Conflict is returned. You must read the configuration again before saving. This field is not an idempotency key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("expectedRevision")
    public Long expectedRevision;

    /**
     * <p>The unique code of the proxied user within the tenant. This parameter is used only when the identity mapping mode of the application credential is source_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxied WINNEXO platform user. This parameter is used only when the identity mapping mode of the application credential is winnexo_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The ID of the target tenant. This parameter is used for tenant routing in public requests. The server-side authentication chain verifies access permissions based on this parameter. You cannot use this parameter to access unauthorized tenants.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The IANA time zone name used for the execution schedule. Default value: Asia/Shanghai. If this parameter is omitted, set to null, or left as a blank string, the default value is used. The length of a non-empty value must be 1 to 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timezone")
    public String timezone;

    public static UpdateKnowledgeBaseSmartIndexConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSmartIndexConfigurationRequest self = new UpdateKnowledgeBaseSmartIndexConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setExpectedRevision(Long expectedRevision) {
        this.expectedRevision = expectedRevision;
        return this;
    }
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateKnowledgeBaseSmartIndexConfigurationRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
