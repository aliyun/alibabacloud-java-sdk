// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSIngestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSIngestionConfiguration configuration;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-oss-123456</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateOSSIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSIngestionRequest self = new CreateOSSIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOSSIngestionRequest setConfiguration(OSSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSIngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOSSIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
