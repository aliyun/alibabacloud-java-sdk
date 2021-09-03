// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailDigitalTemplateRequest extends TeaModel {
    // 主键
    @NameInMap("Id")
    public String id;

    // oem code
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DetailDigitalTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailDigitalTemplateRequest self = new DetailDigitalTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DetailDigitalTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailDigitalTemplateRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DetailDigitalTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DetailDigitalTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
