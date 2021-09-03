// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDefaultEventSourceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("EventSourceModelStr")
    public String eventSourceModelStr;

    public static CreateDefaultEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultEventSourceRequest self = new CreateDefaultEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefaultEventSourceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateDefaultEventSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDefaultEventSourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDefaultEventSourceRequest setEventSourceModelStr(String eventSourceModelStr) {
        this.eventSourceModelStr = eventSourceModelStr;
        return this;
    }
    public String getEventSourceModelStr() {
        return this.eventSourceModelStr;
    }

}
