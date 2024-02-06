// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSIngestion extends TeaModel {
    @NameInMap("configuration")
    public OSSIngestionConfiguration configuration;

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

    public OSSIngestion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
