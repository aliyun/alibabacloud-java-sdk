// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKBSyncLinkRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
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
     * <hr>
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
     * <p>The DingTalk document MCP Server endpoint.</p>
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
     * <p>The DingTalk spreadsheet MCP Server endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543">https://mcp-gw.dingtalk.com/server/1a2b3cxxxxxx567?key=d5e6fxxxxxx543</a></p>
     */
    @NameInMap("SheetMcpEndpoint")
    public String sheetMcpEndpoint;

    /**
     * <p>The source directory address for synchronization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.feishu.cn/wiki/space/xxxxxx">https://example.feishu.cn/wiki/space/xxxxxx</a></p>
     */
    @NameInMap("SourceDir")
    public String sourceDir;

    /**
     * <p>The data source type. Valid values: FEISHU and SHAREPOINT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The synchronization interval. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SyncIntervalMinutes")
    public Integer syncIntervalMinutes;

    /**
     * <p>The tenant ID. This parameter is required when SourceType is set to SHAREPOINT.</p>
     * 
     * <strong>example:</strong>
     * <p>63eexxxx-xxxx-xxxx-xxxx-xxxxxx090f82</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The DingTalk operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123***56</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateKBSyncLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKBSyncLinkRequest self = new CreateKBSyncLinkRequest();
        return TeaModel.build(map, self);
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

    public CreateKBSyncLinkRequest setSheetMcpEndpoint(String sheetMcpEndpoint) {
        this.sheetMcpEndpoint = sheetMcpEndpoint;
        return this;
    }
    public String getSheetMcpEndpoint() {
        return this.sheetMcpEndpoint;
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

    public CreateKBSyncLinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
