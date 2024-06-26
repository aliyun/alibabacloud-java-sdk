// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillProcessListRequest extends TeaModel {
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
     * <p>The list of sessions to close.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxySessId&quot;:&quot;752113700739156671&quot;,&quot;SessionId&quot;:3221555062,&quot;ServerIp&quot;:&quot;10.<em><strong>.</strong>.</em>**&quot;}]</p>
     */
    @NameInMap("SessionList")
    public String sessionList;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t33h8y08k****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static BatchKillProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchKillProcessListRequest self = new BatchKillProcessListRequest();
        return TeaModel.build(map, self);
    }

    public BatchKillProcessListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchKillProcessListRequest setSessionList(String sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public String getSessionList() {
        return this.sessionList;
    }

    public BatchKillProcessListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
