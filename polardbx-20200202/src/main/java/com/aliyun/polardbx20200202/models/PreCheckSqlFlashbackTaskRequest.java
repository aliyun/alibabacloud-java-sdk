// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskRequest extends TeaModel {
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
     * <p>2025-09-21 14:41:00</p>
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-21 14:35:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static PreCheckSqlFlashbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckSqlFlashbackTaskRequest self = new PreCheckSqlFlashbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckSqlFlashbackTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public PreCheckSqlFlashbackTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PreCheckSqlFlashbackTaskRequest setPolardbxInstanceId(String polardbxInstanceId) {
        this.polardbxInstanceId = polardbxInstanceId;
        return this;
    }
    public String getPolardbxInstanceId() {
        return this.polardbxInstanceId;
    }

    public PreCheckSqlFlashbackTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreCheckSqlFlashbackTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
