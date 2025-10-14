// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10 23:23:23</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("PolardbxInstanceId")
    public String polardbxInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecallRestoreType")
    public String recallRestoreType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RecallType")
    public String recallType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SqlPk")
    public String sqlPk;

    /**
     * <strong>example:</strong>
     * <p>INSERT,UPDATE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10 20:23:23</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
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
