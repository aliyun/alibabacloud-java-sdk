// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAlertReq extends TeaModel {
    @NameInMap("configuration")
    public AlertConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateAlertReq build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertReq self = new UpdateAlertReq();
        return TeaModel.build(map, self);
    }

    public UpdateAlertReq setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateAlertReq setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAlertReq setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAlertReq setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
