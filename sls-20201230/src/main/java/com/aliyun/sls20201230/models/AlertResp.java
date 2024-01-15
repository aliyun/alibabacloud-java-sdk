// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertResp extends TeaModel {
    @NameInMap("configuration")
    public AlertConfiguration configuration;

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

    @NameInMap("status")
    public String status;

    public static AlertResp build(java.util.Map<String, ?> map) throws Exception {
        AlertResp self = new AlertResp();
        return TeaModel.build(map, self);
    }

    public AlertResp setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public AlertResp setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AlertResp setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlertResp setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AlertResp setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public AlertResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlertResp setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public AlertResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
