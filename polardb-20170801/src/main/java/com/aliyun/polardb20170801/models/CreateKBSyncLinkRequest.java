// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKBSyncLinkRequest extends TeaModel {
    /**
     * <p>The endpoint of the DingTalk AI table MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/example">https://mcp-gw.dingtalk.com/server/example</a></p>
     */
    @NameInMap("AiTableMcpEndpoint")
    public String aiTableMcpEndpoint;

    /**
     * <p>The TTL of a successful snapshot of chat members for fallback reuse, in seconds. This parameter applies to DINGTALK and FEISHU synchronization links. If this parameter is explicitly configured, it takes precedence. If it is not configured, Feishu uses the value of FeishuChatMemberStaleTtlSeconds. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of a successful snapshot in the same workspace, enterprise, and chat group allowed for reuse. If this parameter is omitted, Feishu uses the legacy dedicated field. If neither is configured, the default value is -1.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("ChatMemberStaleTtlSeconds")
    public Integer chatMemberStaleTtlSeconds;

    /**
     * <p>The client identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_xxxxxxbe8</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-client-secret</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The description of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time-to-live (TTL) of a successful snapshot of Feishu chat members for fallback reuse, in seconds. This parameter can be explicitly set only for FEISHU synchronization links. A value of -1 indicates that the snapshot never expires. A value of 0 indicates that snapshot fallback reuse is disabled. A positive integer indicates the maximum age of a snapshot allowed for reuse. Default value: -1. If this parameter is omitted, the default value -1 takes effect.</p>
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
     * <p>The name of the synchronization link.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("LinkName")
    public String linkName;

    /**
     * <p>The endpoint of the DingTalk document MCP server.</p>
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
     * <p>The synchronization scope mode. This parameter applies only to DINGTALK sources and must be set together with SelectionRules. Valid values:</p>
     * <ul>
     * <li>ALL: Synchronizes files in the source directory that are not excluded by excludes. The includes array must be empty.</li>
     * <li>SELECTED: Synchronizes only files that match includes and are not excluded by excludes. If includes is empty, no files are selected.
     * New configurations take effect starting from the next synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELECTED</p>
     */
    @NameInMap("SelectionMode")
    public String selectionMode;

    /**
     * <p>The file path filtering rules in JSON format. This parameter contains only two required string arrays: includes and excludes. Paths are relative to SourceDir, and exclusion rules take precedence. GLOB is supported: * and ? do not cross directories, and ** matches zero or more directory levels when it occupies a path segment alone. The two arrays can contain a maximum of 256 entries in total. Each entry must be 1 to 512 characters in length. The maximum size of the JSON text is 65,536 UTF-8 bytes. After a file is removed from the synchronization scope, the corresponding document imported by this synchronization link is cleaned up, without affecting the source file or documents of other synchronization links.</p>
     */
    @NameInMap("SelectionRules")
    public String selectionRules;

    /**
     * <p>The endpoint of the DingTalk sheet MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543</a></p>
     */
    @NameInMap("SheetMcpEndpoint")
    public String sheetMcpEndpoint;

    /**
     * <p>Specifies whether to enable synchronization for source deletions.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDeleteSyncEnabled")
    public Boolean sourceDeleteSyncEnabled;

    /**
     * <p>The address of the source directory for synchronization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
     */
    @NameInMap("SourceDir")
    public String sourceDir;

    /**
     * <p>The data source type. Valid values: OSS, DINGTALK, FEISHU, and SHAREPOINT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The synchronization interval, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The ID of the source tenant. This parameter is required and must be set to the Entra tenant ID when SourceType is set to SHAREPOINT, the tenant_key when SourceType is set to FEISHU, or the corpId when SourceType is set to DINGTALK. This parameter is not required when SourceType is set to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>63eexxxx-xxxx-xxxx-xxxx-xxxxxx090f82</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The Feishu user access token. This token is used only when the application identity cannot expand chat members because the bot is not in the chat group.</p>
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
     * <p>The Feishu user refresh token. This token must be provided together with UserAccessToken to automatically rotate the fallback identity for expanding chat members.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user-refresh-token</p>
     */
    @NameInMap("UserRefreshToken")
    public String userRefreshToken;

    public static CreateKBSyncLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKBSyncLinkRequest self = new CreateKBSyncLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKBSyncLinkRequest setAiTableMcpEndpoint(String aiTableMcpEndpoint) {
        this.aiTableMcpEndpoint = aiTableMcpEndpoint;
        return this;
    }
    public String getAiTableMcpEndpoint() {
        return this.aiTableMcpEndpoint;
    }

    public CreateKBSyncLinkRequest setChatMemberStaleTtlSeconds(Integer chatMemberStaleTtlSeconds) {
        this.chatMemberStaleTtlSeconds = chatMemberStaleTtlSeconds;
        return this;
    }
    public Integer getChatMemberStaleTtlSeconds() {
        return this.chatMemberStaleTtlSeconds;
    }

    public CreateKBSyncLinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateKBSyncLinkRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public CreateKBSyncLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKBSyncLinkRequest setFeishuChatMemberStaleTtlSeconds(Integer feishuChatMemberStaleTtlSeconds) {
        this.feishuChatMemberStaleTtlSeconds = feishuChatMemberStaleTtlSeconds;
        return this;
    }
    public Integer getFeishuChatMemberStaleTtlSeconds() {
        return this.feishuChatMemberStaleTtlSeconds;
    }

    public CreateKBSyncLinkRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKBSyncLinkRequest setLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }
    public String getLinkName() {
        return this.linkName;
    }

    public CreateKBSyncLinkRequest setMcpEndpoint(String mcpEndpoint) {
        this.mcpEndpoint = mcpEndpoint;
        return this;
    }
    public String getMcpEndpoint() {
        return this.mcpEndpoint;
    }

    public CreateKBSyncLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKBSyncLinkRequest setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }
    public String getSelectionMode() {
        return this.selectionMode;
    }

    public CreateKBSyncLinkRequest setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
        return this;
    }
    public String getSelectionRules() {
        return this.selectionRules;
    }

    public CreateKBSyncLinkRequest setSheetMcpEndpoint(String sheetMcpEndpoint) {
        this.sheetMcpEndpoint = sheetMcpEndpoint;
        return this;
    }
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
    }

    public CreateKBSyncLinkRequest setSourceDeleteSyncEnabled(Boolean sourceDeleteSyncEnabled) {
        this.sourceDeleteSyncEnabled = sourceDeleteSyncEnabled;
        return this;
    }
    public Boolean getSourceDeleteSyncEnabled() {
        return this.sourceDeleteSyncEnabled;
    }

    public CreateKBSyncLinkRequest setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
        return this;
    }
    public String getSourceDir() {
        return this.sourceDir;
    }

    public CreateKBSyncLinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateKBSyncLinkRequest setSyncIntervalMinutes(Integer syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    public CreateKBSyncLinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateKBSyncLinkRequest setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
        return this;
    }
    public String getUserAccessToken() {
        return this.userAccessToken;
    }

    public CreateKBSyncLinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateKBSyncLinkRequest setUserRefreshToken(String userRefreshToken) {
        this.userRefreshToken = userRefreshToken;
        return this;
    }
    public String getUserRefreshToken() {
        return this.userRefreshToken;
    }

}
