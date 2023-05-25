// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class KillProcessListRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of the sessions that need to be closed.</p>
     */
    @NameInMap("SessionList")
    public String sessionList;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static KillProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        KillProcessListRequest self = new KillProcessListRequest();
        return TeaModel.build(map, self);
    }

    public KillProcessListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public KillProcessListRequest setSessionList(String sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public String getSessionList() {
        return this.sessionList;
    }

    public KillProcessListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
