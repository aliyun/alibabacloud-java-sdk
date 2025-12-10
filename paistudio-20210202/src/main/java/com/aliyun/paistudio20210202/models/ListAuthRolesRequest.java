// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAuthRolesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsGenerateToken")
    public String isGenerateToken;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAuthRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRolesRequest self = new ListAuthRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthRolesRequest setIsGenerateToken(String isGenerateToken) {
        this.isGenerateToken = isGenerateToken;
        return this;
    }
    public String getIsGenerateToken() {
        return this.isGenerateToken;
    }

    public ListAuthRolesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
