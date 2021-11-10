// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailTemplateRequest extends TeaModel {
    // oem_access_id
    @NameInMap("AccessId")
    public String accessId;

    // 主键
    @NameInMap("Id")
    public String id;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DetailTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailTemplateRequest self = new DetailTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DetailTemplateRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DetailTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DetailTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
