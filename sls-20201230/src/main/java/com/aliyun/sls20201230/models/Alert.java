// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Alert extends TeaModel {
    @NameInMap("configuration")
    public Configuration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    @NameInMap("state")
    public String state;

    @NameInMap("type")
    public String type;

    public static Alert build(java.util.Map<String, ?> map) throws Exception {
        Alert self = new Alert();
        return TeaModel.build(map, self);
    }

    public Alert setConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }
    public Configuration getConfiguration() {
        return this.configuration;
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

    public Alert setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Alert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
