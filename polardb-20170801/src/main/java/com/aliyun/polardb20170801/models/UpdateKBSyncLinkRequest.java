// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkRequest extends TeaModel {
    /**
     * <p>The endpoint of the DingTalk AI Tables MCP server. An empty string indicates deletion.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/example">https://mcp-gw.dingtalk.com/server/example</a></p>
     */
    @NameInMap("AiTableMcpEndpoint")
    public String aiTableMcpEndpoint;

    /**
     * <p>The validity period of the successful group member snapshot used for fallback reuse, in seconds. This parameter applies to DingTalk and Lark synchronization links. If this field is explicitly configured, it takes precedence. If not configured, Lark uses FeishuChatMemberStaleTtlSeconds. A value of -1 indicates that the snapshot never expires. A value of 0 disables snapshot fallback reuse. A positive integer indicates the maximum age of successful snapshots in the same workspace, enterprise, and group allowed for reuse. If omitted, the original value is retained. Explicitly passing -1 restores the default behavior.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("ChatMemberStaleTtlSeconds")
    public Integer chatMemberStaleTtlSeconds;

    /**
     * <p>The client identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_xxxxxxbe8</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret information.</p>
     * 
     * <strong>example:</strong>
     * <p>example-client-secret</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The validity period of the successful Lark group member snapshot used for fallback reuse, in seconds. This parameter can only be explicitly set for Lark synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 disables snapshot fallback reuse. A positive integer indicates the maximum age of the snapshot allowed for reuse. If omitted, the original value is retained. Explicitly passing -1 restores the default behavior.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("FeishuChatMemberStaleTtlSeconds")
    public Integer feishuChatMemberStaleTtlSeconds;

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
     * <p>The ID of the synchronization link.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-xxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The endpoint of the DingTalk Docs MCP server.</p>
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
     * <p>This parameter applies only to DingTalk sources and must be set together with SelectionRules. Valid values: ALL: Synchronizes files in the source directory that are not excluded by excludes. The includes parameter must be an empty array. SELECTED: Synchronizes only files that match includes and are not excluded by excludes. If includes is empty, no files are selected. If this parameter is not provided, the original configuration is retained. If both parameters are provided, the original rules are replaced. This parameter cannot be modified at the same time as SyncEnabled. The new configuration takes effect starting from the next synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECTED</p>
     */
    @NameInMap("SelectionMode")
    public String selectionMode;

    /**
     * <p>The file path filtering rules in JSON format. It only contains two required string arrays: includes and excludes. Paths are relative to SourceDir, and exclusion rules take precedence. GLOB is supported: * and ? do not cross directories, and ** matches zero or more directory levels when it occupies a path segment alone. The two arrays can contain a maximum of 256 entries in total. Each entry must be 1 to 512 characters in length. The maximum size of the JSON text is 65,536 UTF-8 bytes. After a file is removed from the synchronization scope, the corresponding documents imported by this synchronization link are cleared, without affecting the source files and documents of other synchronization links.</p>
     */
    @NameInMap("SelectionRules")
    public String selectionRules;

    /**
     * <p>The endpoint of the DingTalk Sheets MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543</a></p>
     */
    @NameInMap("SheetMcpEndpoint")
    public String sheetMcpEndpoint;

    /**
     * <p>Specifies whether to synchronize deletions from the source.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDeleteSyncEnabled")
    public Boolean sourceDeleteSyncEnabled;

    /**
     * <p>Specifies whether to enable automatic synchronization. This parameter can only be modified individually and cannot be changed along with other configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncEnabled")
    public Boolean syncEnabled;

    /**
     * <p>The automatic synchronization interval, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The new Lark user access token.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user-access-token</p>
     */
    @NameInMap("UserAccessToken")
    public String userAccessToken;

    /**
     * <p>The ID of the DingTalk operator.</p>
     * 
     * <strong>example:</strong>
     * <p>123***56</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The new Lark user refresh token. It must be provided together with UserAccessToken. Passing two empty strings indicates deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user-refresh-token</p>
     */
    @NameInMap("UserRefreshToken")
    public String userRefreshToken;

    public static UpdateKBSyncLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKBSyncLinkRequest self = new UpdateKBSyncLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKBSyncLinkRequest setAiTableMcpEndpoint(String aiTableMcpEndpoint) {
        this.aiTableMcpEndpoint = aiTableMcpEndpoint;
        return this;
    }
    public String getAiTableMcpEndpoint() {
        return this.aiTableMcpEndpoint;
    }

    public UpdateKBSyncLinkRequest setChatMemberStaleTtlSeconds(Integer chatMemberStaleTtlSeconds) {
        this.chatMemberStaleTtlSeconds = chatMemberStaleTtlSeconds;
        return this;
    }
    public Integer getChatMemberStaleTtlSeconds() {
        return this.chatMemberStaleTtlSeconds;
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

    public UpdateKBSyncLinkRequest setFeishuChatMemberStaleTtlSeconds(Integer feishuChatMemberStaleTtlSeconds) {
        this.feishuChatMemberStaleTtlSeconds = feishuChatMemberStaleTtlSeconds;
        return this;
    }
    public Integer getFeishuChatMemberStaleTtlSeconds() {
        return this.feishuChatMemberStaleTtlSeconds;
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

    public UpdateKBSyncLinkRequest setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }
    public String getSelectionMode() {
        return this.selectionMode;
    }

    public UpdateKBSyncLinkRequest setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
        return this;
    }
    public String getSelectionRules() {
        return this.selectionRules;
    }

    public UpdateKBSyncLinkRequest setSheetMcpEndpoint(String sheetMcpEndpoint) {
        this.sheetMcpEndpoint = sheetMcpEndpoint;
        return this;
    }
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
    }

    public UpdateKBSyncLinkRequest setSourceDeleteSyncEnabled(Boolean sourceDeleteSyncEnabled) {
        this.sourceDeleteSyncEnabled = sourceDeleteSyncEnabled;
        return this;
    }
    public Boolean getSourceDeleteSyncEnabled() {
        return this.sourceDeleteSyncEnabled;
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

    public UpdateKBSyncLinkRequest setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
        return this;
    }
    public String getUserAccessToken() {
        return this.userAccessToken;
    }

    public UpdateKBSyncLinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateKBSyncLinkRequest setUserRefreshToken(String userRefreshToken) {
        this.userRefreshToken = userRefreshToken;
        return this;
    }
    public String getUserRefreshToken() {
        return this.userRefreshToken;
    }

}
