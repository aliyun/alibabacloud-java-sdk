// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLPlansRequest extends TeaModel {
    /**
     * <p>Supported language. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <p>The end time of querying the SQL execution plan.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-12T05:38:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PlanUnionHash")
    public String planUnionHash;

    @NameInMap("ReturnBriefInfo")
    public Boolean returnBriefInfo;

    /**
     * <p>SQL ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The start time of querying the SQL execution plan.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-12T04:38:38Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t4louaeei****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeOasSQLPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLPlansRequest self = new DescribeOasSQLPlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLPlansRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeOasSQLPlansRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeOasSQLPlansRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public DescribeOasSQLPlansRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOasSQLPlansRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOasSQLPlansRequest setPlanUnionHash(String planUnionHash) {
        this.planUnionHash = planUnionHash;
        return this;
    }
    public String getPlanUnionHash() {
        return this.planUnionHash;
    }

    public DescribeOasSQLPlansRequest setReturnBriefInfo(Boolean returnBriefInfo) {
        this.returnBriefInfo = returnBriefInfo;
        return this;
    }
    public Boolean getReturnBriefInfo() {
        return this.returnBriefInfo;
    }

    public DescribeOasSQLPlansRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public DescribeOasSQLPlansRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOasSQLPlansRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
