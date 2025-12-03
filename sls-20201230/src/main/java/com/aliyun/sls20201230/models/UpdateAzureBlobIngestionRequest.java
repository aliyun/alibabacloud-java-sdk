// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAzureBlobIngestionRequest extends TeaModel {
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

    @NameInMap("schedule")
    public Schedule schedule;

    public static UpdateAzureBlobIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAzureBlobIngestionRequest self = new UpdateAzureBlobIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAzureBlobIngestionRequest setConfiguration(AzureBlobIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AzureBlobIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateAzureBlobIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAzureBlobIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAzureBlobIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
