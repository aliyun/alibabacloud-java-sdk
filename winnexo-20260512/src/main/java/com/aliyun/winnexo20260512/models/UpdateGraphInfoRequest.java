// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoRequest extends TeaModel {
    /**
     * <p>业务说明（可选；传空串表示清空；与 displayName 至少传其一）</p>
     * 
     * <strong>example:</strong>
     * <p>客户域语义图谱</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>图谱展示名（可选，最多200字；传空串或纯空白会被拒绝；与 businessProfile 至少传其一）</p>
     * 
     * <strong>example:</strong>
     * <p>CRM 图谱</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>图谱名称</p>
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

    public static UpdateGraphInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphInfoRequest self = new UpdateGraphInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGraphInfoRequest setBusinessProfile(String businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    public UpdateGraphInfoRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateGraphInfoRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public UpdateGraphInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
