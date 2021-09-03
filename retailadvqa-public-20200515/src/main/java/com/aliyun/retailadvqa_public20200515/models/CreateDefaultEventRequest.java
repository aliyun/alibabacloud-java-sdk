// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("EventModelStr")
    public String eventModelStr;

    public static CreateDefaultEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventRequest self = new CreateDefaultEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateDefaultEventRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDefaultEventRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDefaultEventRequest setEventModelStr(String eventModelStr) {
        this.eventModelStr = eventModelStr;
        return this;
    }
    public String getEventModelStr() {
        return this.eventModelStr;
    }

}
