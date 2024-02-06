// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAlertRequest extends TeaModel {
    @NameInMap("configuration")
    public AlertConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRequest self = new UpdateAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRequest setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateAlertRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAlertRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAlertRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
