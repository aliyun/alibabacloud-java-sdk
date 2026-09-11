// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGraphRequest extends TeaModel {
    /**
     * <p>业务说明（可选）</p>
     * 
     * <strong>example:</strong>
     * <p>客户域语义图谱</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>绑定的数据源 ID（控制台已创建的 RDB 类数据源）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>198001</p>
     */
    @NameInMap("dataSourceId")
    public Long dataSourceId;

    /**
     * <p>图谱展示名（可选，租户内大小写不敏感唯一，最多200字）</p>
     * 
     * <strong>example:</strong>
     * <p>CRM 图谱</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>图谱名称，字母开头+字母/数字/下划线，长度不超过64，租户内唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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

    public CreateGraphRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
