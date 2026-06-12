// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateS3IngestionRequest extends TeaModel {
    /**
     * <p>The configuration.</p>
     */
    @NameInMap("configuration")
    public S3IngestionConfiguration configuration;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the job. Follow these naming rules:</p>
     * <p>Each job in the same project must have a unique name.</p>
     * <ul>
     * <li><p>Use only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>Start and end with a lowercase letter or digit.</p>
     * </li>
     * <li><p>Be 2 to 64 characters long.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateS3IngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateS3IngestionRequest self = new CreateS3IngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateS3IngestionRequest setConfiguration(S3IngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public S3IngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateS3IngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateS3IngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateS3IngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateS3IngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
