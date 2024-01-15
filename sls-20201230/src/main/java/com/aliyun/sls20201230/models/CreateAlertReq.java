// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAlertReq extends TeaModel {
    @NameInMap("configuration")
    public AlertConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateAlertReq build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertReq self = new CreateAlertReq();
        return TeaModel.build(map, self);
    }

    public CreateAlertReq setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateAlertReq setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlertReq setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAlertReq setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertReq setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
