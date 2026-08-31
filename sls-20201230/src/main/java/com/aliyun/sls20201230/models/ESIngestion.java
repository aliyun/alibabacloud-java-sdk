// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ESIngestion extends TeaModel {
    /**
     * <p>The ES import configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ESIngestionConfiguration configuration;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>job description</p>
     * 
     * <strong>example:</strong>
     * <p>es ingestion</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>job displayName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>es ingestion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The last modified time.</p>
     * 
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The import task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-es-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c7f01719d9feb105fc9d8df92af62010</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>The import status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static ESIngestion build(java.util.Map<String, ?> map) throws Exception {
        ESIngestion self = new ESIngestion();
        return TeaModel.build(map, self);
    }

    public ESIngestion setConfiguration(ESIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ESIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public ESIngestion setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ESIngestion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ESIngestion setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ESIngestion setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ESIngestion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ESIngestion setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public ESIngestion setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ESIngestion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
