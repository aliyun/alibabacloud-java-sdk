// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ScheduledSQL extends TeaModel {
    @NameInMap("configuration")
    public ScheduledSQLConfiguration configuration;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    @NameInMap("scheduleId")
    public String scheduleId;

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

}
