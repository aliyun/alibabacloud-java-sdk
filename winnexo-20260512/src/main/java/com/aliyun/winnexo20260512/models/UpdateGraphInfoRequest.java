// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoRequest extends TeaModel {
    /**
     * <p>The application token issued by the console. If you specify this parameter, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The business description of the graph. If this parameter is not specified, the value is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer domain semantic graph</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>CRM Graph</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the graph.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxy user, which is the user ID on the WINNEXO platform. This parameter is used only when the application credential is configured as winnexo_uid.</p>
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

    public static UpdateGraphInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphInfoRequest self = new UpdateGraphInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGraphInfoRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public UpdateGraphInfoRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateGraphInfoRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateGraphInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
