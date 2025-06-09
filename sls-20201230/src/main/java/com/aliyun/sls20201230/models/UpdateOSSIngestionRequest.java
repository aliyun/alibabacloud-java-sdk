// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOSSIngestionRequest extends TeaModel {
    /**
     * <p>The configuration of the OSS data import job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSIngestionConfiguration configuration;

    /**
     * <p>The description of the Object Storage Service (OSS) data import job.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the OSS data import job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The scheduling type. By default, you do not need to specify this parameter. If you want to import data at regular intervals, such as importing data every Monday at 08: 00., you can specify a cron expression.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateOSSIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOSSIngestionRequest self = new UpdateOSSIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOSSIngestionRequest setConfiguration(OSSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateOSSIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOSSIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateOSSIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
