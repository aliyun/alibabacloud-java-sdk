// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProcessStatsCompositionRequest extends TeaModel {
    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.<em>.</em>.*</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

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
     * <p>The IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>127.<em>.</em>.*</p>
     */
    @NameInMap("ServerIp")
    public String serverIp;

    /**
     * <p>The SQL statement. It supports LIKE clauses, and you may specify only part of the clauses in the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
     */
    @NameInMap("SqlText")
    public String sqlText;

    /**
     * <p>The state of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>t33h8y08k****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The user identifier (UID) of OceanBase Database.</p>
     * 
     * <strong>example:</strong>
     * <p>139*************</p>
     */
    @NameInMap("UId")
    public String UId;

    /**
     * <p>The username that you use to log in to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
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
