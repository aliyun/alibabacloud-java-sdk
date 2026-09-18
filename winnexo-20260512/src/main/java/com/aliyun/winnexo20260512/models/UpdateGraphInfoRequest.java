// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoRequest extends TeaModel {
    /**
     * <p>The business description of the knowledge graph. If not configured, the value is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer domain knowledge graph</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>The display name of the knowledge graph.</p>
     * 
     * <strong>example:</strong>
     * <p>CRM Graph</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the knowledge graph.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The tenant ID.</p>
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
