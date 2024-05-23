// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProcessStatsCompositionRequest extends TeaModel {
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("SqlText")
    public String sqlText;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UId")
    public String UId;

    @NameInMap("Users")
    public String users;

    public static DescribeProcessStatsCompositionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatsCompositionRequest self = new DescribeProcessStatsCompositionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatsCompositionRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeProcessStatsCompositionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeProcessStatsCompositionRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public DescribeProcessStatsCompositionRequest setSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }
    public String getSqlText() {
        return this.sqlText;
    }

    public DescribeProcessStatsCompositionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeProcessStatsCompositionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeProcessStatsCompositionRequest setUId(String UId) {
        this.UId = UId;
        return this;
    }
    public String getUId() {
        return this.UId;
    }

    public DescribeProcessStatsCompositionRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
