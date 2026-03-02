// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeleteMemoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CD51C0ED-4666-13DA-BC7D-C0D21CBE16C</p>
     */
    @NameInMap("MemoryNodeId")
    public String memoryNodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5A7C969B-5101-112B-8202-DFAEEA4BFBED</p>
     */
    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jb5sabg80b4ts71g</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryRequest self = new DeleteMemoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMemoryRequest setMemoryNodeId(String memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
        return this;
    }
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    public DeleteMemoryRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public DeleteMemoryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
