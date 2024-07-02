// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillSessionListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>342,354,343</p>
     */
    @NameInMap("SessionList")
    public String sessionList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t4louaeei****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static BatchKillSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchKillSessionListRequest self = new BatchKillSessionListRequest();
        return TeaModel.build(map, self);
    }

    public BatchKillSessionListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchKillSessionListRequest setSessionList(String sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public String getSessionList() {
        return this.sessionList;
    }

    public BatchKillSessionListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
