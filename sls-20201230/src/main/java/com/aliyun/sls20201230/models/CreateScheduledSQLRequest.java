// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateScheduledSQLRequest extends TeaModel {
    /**
     * <p>The configuration of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ScheduledSQLConfiguration configuration;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>创建一个定时SQL任务</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-scheduled-sql</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The job name. The name must be unique within a project.</p>
     * <p>The naming convention is as follows:</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 2 to 64 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-123456789-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling configuration for the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateScheduledSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledSQLRequest self = new CreateScheduledSQLRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledSQLRequest setConfiguration(ScheduledSQLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ScheduledSQLConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateScheduledSQLRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduledSQLRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateScheduledSQLRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledSQLRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
