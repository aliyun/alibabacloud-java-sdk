// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskPushOptionsRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group (such as cg_101). If specified, a group workspace task is created (the caller must be a valid group member). If left empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The name of the currently active digital employee. This value is empty if not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDigitalEmployeeName</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetScheduledTaskPushOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskPushOptionsRequest self = new GetScheduledTaskPushOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskPushOptionsRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetScheduledTaskPushOptionsRequest setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetScheduledTaskPushOptionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
