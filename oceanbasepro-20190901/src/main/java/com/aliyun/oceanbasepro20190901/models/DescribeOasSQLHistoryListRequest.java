// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLHistoryListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <p>- zh: Chinese</p>
     * <p>- en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <p>The end time of querying the execution history of the SQL statement.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the node.</p>
     */
    @NameInMap("NodeIp")
    public String nodeIp;

    /**
     * <p>SQL ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The start time of querying the execution history of the SQL statement.   </p>
     * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeOasSQLHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLHistoryListRequest self = new DescribeOasSQLHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLHistoryListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeOasSQLHistoryListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeOasSQLHistoryListRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public DescribeOasSQLHistoryListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOasSQLHistoryListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOasSQLHistoryListRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeOasSQLHistoryListRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeOasSQLHistoryListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOasSQLHistoryListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
