// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-xxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    @NameInMap("McpEndpoint")
    public String mcpEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SheetMcpEndpoint")
    public String sheetMcpEndpoint;

    @NameInMap("SyncEnabled")
    public Boolean syncEnabled;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    @NameInMap("UserId")
    public String userId;

    public static UpdateKBSyncLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKBSyncLinkRequest self = new UpdateKBSyncLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKBSyncLinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateKBSyncLinkRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public UpdateKBSyncLinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKBSyncLinkRequest setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public UpdateKBSyncLinkRequest setMcpEndpoint(String mcpEndpoint) {
        this.mcpEndpoint = mcpEndpoint;
        return this;
    }
    public String getMcpEndpoint() {
        return this.mcpEndpoint;
    }

    public UpdateKBSyncLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKBSyncLinkRequest setSheetMcpEndpoint(String sheetMcpEndpoint) {
        this.sheetMcpEndpoint = sheetMcpEndpoint;
        return this;
    }
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
    }

    public UpdateKBSyncLinkRequest setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
        return this;
    }
    public Boolean getSyncEnabled() {
        return this.syncEnabled;
    }

    public UpdateKBSyncLinkRequest setSyncIntervalMinutes(Integer syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    public UpdateKBSyncLinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
