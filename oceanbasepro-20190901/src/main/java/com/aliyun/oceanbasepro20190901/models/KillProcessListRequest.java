// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class KillProcessListRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of the sessions that need to be closed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ServerIp&quot;:&quot;192.168.13.119&quot;,&quot;SessionId&quot;:&quot;3221614618&quot;}]</p>
     */
    @NameInMap("SessionList")
    public String sessionList;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t4louaeei****</p>
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
