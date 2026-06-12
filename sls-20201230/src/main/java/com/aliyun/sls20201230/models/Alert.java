// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Alert extends TeaModel {
    /**
     * <p>The configuration of the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public AlertConfiguration configuration;

    /**
     * <p>The time when the alert rule was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert Desc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alertNameExample</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The time when the alert rule was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1714274900</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alert-123456</p>
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
     * <p>The status of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLED/DISABLED</p>
     */
    @NameInMap("status")
    public String status;

    public static Alert build(java.util.Map<String, ?> map) throws Exception {
        Alert self = new Alert();
        return TeaModel.build(map, self);
    }

    public Alert setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public Alert setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Alert setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Alert setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Alert setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Alert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Alert setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public Alert setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
