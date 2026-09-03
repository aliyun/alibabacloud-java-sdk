// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_xxxxxxbe8</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The unique identifier of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The synchronization link ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-xxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The MCP Server address for DingTalk documents.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx789?key=d5e6fxxxxxx876">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx789?key=d5e6fxxxxxx876</a></p>
     */
    @NameInMap("McpEndpoint")
    public String mcpEndpoint;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The MCP Server address for DingTalk spreadsheets.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543</a></p>
     */
    @NameInMap("SheetMcpEndpoint")
    public String sheetMcpEndpoint;

    /**
     * <p>Specifies whether to enable automatic synchronization. This parameter can only be modified independently and cannot be changed together with other configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncEnabled")
    public Boolean syncEnabled;

    /**
     * <p>20</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The DingTalk user ID for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123***56</p>
     */
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
