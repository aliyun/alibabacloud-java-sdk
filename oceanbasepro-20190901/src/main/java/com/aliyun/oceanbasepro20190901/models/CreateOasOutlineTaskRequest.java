// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOasOutlineTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BySqlId")
    public Boolean bySqlId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_data</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DynamicSql")
    public Boolean dynamicSql;

    /**
     * <strong>example:</strong>
     * <p>2025-05-13T16:40:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>idx_a</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsConcurrentLimit")
    public Boolean isConcurrentLimit;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxConcurrent")
    public Integer maxConcurrent;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("PlanData")
    public String planData;

    /**
     * <p>SQL ID</p>
     * 
     * <strong>example:</strong>
     * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
     */
    @NameInMap("SqlText")
    public String sqlText;

    /**
     * <strong>example:</strong>
     * <p>2025-05-13T15:40:43Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("StatementId")
    public String statementId;

    /**
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>139*************</p>
     */
    @NameInMap("UId")
    public String UId;

    public static CreateOasOutlineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOasOutlineTaskRequest self = new CreateOasOutlineTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOasOutlineTaskRequest setBySqlId(Boolean bySqlId) {
        this.bySqlId = bySqlId;
        return this;
    }
    public Boolean getBySqlId() {
        return this.bySqlId;
    }

    public CreateOasOutlineTaskRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateOasOutlineTaskRequest setDynamicSql(Boolean dynamicSql) {
        this.dynamicSql = dynamicSql;
        return this;
    }
    public Boolean getDynamicSql() {
        return this.dynamicSql;
    }

    public CreateOasOutlineTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOasOutlineTaskRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public CreateOasOutlineTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOasOutlineTaskRequest setIsConcurrentLimit(Boolean isConcurrentLimit) {
        this.isConcurrentLimit = isConcurrentLimit;
        return this;
    }
    public Boolean getIsConcurrentLimit() {
        return this.isConcurrentLimit;
    }

    public CreateOasOutlineTaskRequest setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    public CreateOasOutlineTaskRequest setPlanData(String planData) {
        this.planData = planData;
        return this;
    }
    public String getPlanData() {
        return this.planData;
    }

    public CreateOasOutlineTaskRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public CreateOasOutlineTaskRequest setSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }
    public String getSqlText() {
        return this.sqlText;
    }

    public CreateOasOutlineTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateOasOutlineTaskRequest setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

    public CreateOasOutlineTaskRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateOasOutlineTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOasOutlineTaskRequest setUId(String UId) {
        this.UId = UId;
        return this;
    }
    public String getUId() {
        return this.UId;
    }

}
