// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGraphRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The business description of the graph. If not configured, it is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer domain semantic graph</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>198001</p>
     */
    @NameInMap("dataSourceId")
    public Long dataSourceId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>CRM Graph</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The graph name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGraphRequest self = new CreateGraphRequest();
        return TeaModel.build(map, self);
    }

    public CreateGraphRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateGraphRequest setBusinessProfile(String businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    public CreateGraphRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateGraphRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateGraphRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public CreateGraphRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateGraphRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateGraphRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
