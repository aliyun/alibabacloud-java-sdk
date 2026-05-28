// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSIngestion extends TeaModel {
    /**
     * <p>The configurations of the OSS data import job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSIngestionConfiguration configuration;

    /**
     * <p>The time when the data import job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description of the data import job.</p>
     * 
     * <strong>example:</strong>
     * <p>oss ingestion</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the data import job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss ingestion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The time when the data import job was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The name of the data import job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-oss-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    /**
     * <p>The ID of the data import job.</p>
     * 
     * <strong>example:</strong>
     * <p>c7f01719d9feb105fc9d8df92af62010</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>The status of the data import job.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static OSSIngestion build(java.util.Map<String, ?> map) throws Exception {
        OSSIngestion self = new OSSIngestion();
        return TeaModel.build(map, self);
    }

    public OSSIngestion setConfiguration(OSSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public OSSIngestion setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public OSSIngestion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OSSIngestion setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public OSSIngestion setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public OSSIngestion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OSSIngestion setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public OSSIngestion setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public OSSIngestion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
