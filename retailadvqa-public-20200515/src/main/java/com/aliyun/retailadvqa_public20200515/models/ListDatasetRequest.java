// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListDatasetRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetRequest self = new ListDatasetRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListDatasetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListDatasetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
