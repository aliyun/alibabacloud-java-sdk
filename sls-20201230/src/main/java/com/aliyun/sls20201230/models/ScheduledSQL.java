// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ScheduledSQL extends TeaModel {
    /**
     * <p>定时sql配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ScheduledSQLConfiguration configuration;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1714123644</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>Job Description</p>
     * 
     * <strong>example:</strong>
     * <p>This is a scheduled sql job</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Job DisplayName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a scheduled sql job</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>最近修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>1714123644</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>Scheduled SQL name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-scheduled-sql</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>调度配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    /**
     * <p>调度ID</p>
     * 
     * <strong>example:</strong>
     * <p>e73f43732852064ad5d091914e39342f</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>定时SQL状态</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("status")
    public String status;

    public static ScheduledSQL build(java.util.Map<String, ?> map) throws Exception {
        ScheduledSQL self = new ScheduledSQL();
        return TeaModel.build(map, self);
    }

    public ScheduledSQL setConfiguration(ScheduledSQLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ScheduledSQLConfiguration getConfiguration() {
        return this.configuration;
    }

    public ScheduledSQL setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ScheduledSQL setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ScheduledSQL setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ScheduledSQL setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ScheduledSQL setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledSQL setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public ScheduledSQL setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ScheduledSQL setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
