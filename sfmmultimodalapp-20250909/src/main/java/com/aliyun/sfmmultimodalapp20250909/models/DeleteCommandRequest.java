// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteCommandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_xxxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7533545</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>564646456</p>
     */
    @NameInMap("ToolId")
    public String toolId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandRequest self = new DeleteCommandRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommandRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCommandRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public DeleteCommandRequest setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public DeleteCommandRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
