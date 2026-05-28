// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAlertRequest extends TeaModel {
    /**
     * <p>The detailed configurations of the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public AlertConfiguration configuration;

    /**
     * <p>The description of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>An alert rule</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-alert</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the alert rule. Make sure that the name is unique in a project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alert-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling configurations of the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRequest self = new CreateAlertRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertRequest setConfiguration(AlertConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AlertConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateAlertRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlertRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAlertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
