// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end time for executing the flashback SQL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10 23:23:23</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("PolardbxInstanceId")
    public String polardbxInstanceId;

    /**
     * <p>The restoration type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Image-based restoration.</li>
     * <li><strong>0</strong>: Reverse restoration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecallRestoreType")
    public String recallRestoreType;

    /**
     * <p>The matching mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: exact match.</li>
     * <li><strong>1</strong>: fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RecallType")
    public String recallType;

    /**
     * <p>The region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The primary key of the flashback SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SqlPk")
    public String sqlPk;

    /**
     * <p>The type of SQL. Valid values: INSERT, UPDATE, and DELETE. Separate multiple types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>INSERT,UPDATE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time for executing the flashback SQL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10 20:23:23</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the table on which the flashback SQL operation is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The trace ID of the flashback SQL.</p>
     * 
     * <strong>example:</strong>
     * <p>ase*****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static SubmitSqlFlashbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlFlashbackTaskRequest self = new SubmitSqlFlashbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSqlFlashbackTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSqlFlashbackTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SubmitSqlFlashbackTaskRequest setPolardbxInstanceId(String polardbxInstanceId) {
        this.polardbxInstanceId = polardbxInstanceId;
        return this;
    }
    public String getPolardbxInstanceId() {
        return this.polardbxInstanceId;
    }

    public SubmitSqlFlashbackTaskRequest setRecallRestoreType(String recallRestoreType) {
        this.recallRestoreType = recallRestoreType;
        return this;
    }
    public String getRecallRestoreType() {
        return this.recallRestoreType;
    }

    public SubmitSqlFlashbackTaskRequest setRecallType(String recallType) {
        this.recallType = recallType;
        return this;
    }
    public String getRecallType() {
        return this.recallType;
    }

    public SubmitSqlFlashbackTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitSqlFlashbackTaskRequest setSqlPk(String sqlPk) {
        this.sqlPk = sqlPk;
        return this;
    }
    public String getSqlPk() {
        return this.sqlPk;
    }

    public SubmitSqlFlashbackTaskRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public SubmitSqlFlashbackTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitSqlFlashbackTaskRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public SubmitSqlFlashbackTaskRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
