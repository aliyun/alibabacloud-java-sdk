// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateElasticsearchIngestionRequest extends TeaModel {
    /**
     * <p>The configuration for the ES or OpenSearch import job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ESIngestionConfiguration configuration;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>es ingestion</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>es ingestion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The unique identifier of the ES or OpenSearch import job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-elasticsearch- 123456-123</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The schedule structure.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateElasticsearchIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticsearchIngestionRequest self = new CreateElasticsearchIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticsearchIngestionRequest setConfiguration(ESIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ESIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateElasticsearchIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateElasticsearchIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateElasticsearchIngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateElasticsearchIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
