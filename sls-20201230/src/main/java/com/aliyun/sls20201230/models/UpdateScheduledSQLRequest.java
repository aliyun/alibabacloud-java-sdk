// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateScheduledSQLRequest extends TeaModel {
    @NameInMap("configuration")
    public ScheduledSQLConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateScheduledSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledSQLRequest self = new UpdateScheduledSQLRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledSQLRequest setConfiguration(ScheduledSQLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ScheduledSQLConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateScheduledSQLRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScheduledSQLRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateScheduledSQLRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
