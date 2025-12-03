// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateElasticsearchIngestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ESIngestionConfiguration configuration;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateElasticsearchIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateElasticsearchIngestionRequest self = new UpdateElasticsearchIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateElasticsearchIngestionRequest setConfiguration(ESIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ESIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateElasticsearchIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateElasticsearchIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateElasticsearchIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
