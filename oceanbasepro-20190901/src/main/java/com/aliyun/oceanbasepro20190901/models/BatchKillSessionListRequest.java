// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillSessionListRequest extends TeaModel {
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
     * <p>The list of sessions, which is concatenated with commas.</p>
     * <blockquote>
     * <p>The session information is obtained from the result returned by the DescribeSessionList API.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>342,354,343</p>
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
