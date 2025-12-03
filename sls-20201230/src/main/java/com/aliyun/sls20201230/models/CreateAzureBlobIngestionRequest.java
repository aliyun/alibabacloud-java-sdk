// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAzureBlobIngestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public AzureBlobIngestionConfiguration configuration;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateAzureBlobIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAzureBlobIngestionRequest self = new CreateAzureBlobIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAzureBlobIngestionRequest setConfiguration(AzureBlobIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AzureBlobIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateAzureBlobIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAzureBlobIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAzureBlobIngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAzureBlobIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
