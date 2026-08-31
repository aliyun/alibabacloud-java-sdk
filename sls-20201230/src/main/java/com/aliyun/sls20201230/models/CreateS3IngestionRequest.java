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
     * <p>The task description.</p>
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
     * <p>The job name. The naming rules are as follows:</p>
     * <p>Job names must be unique within the same project.</p>
     * <ul>
     * <li>Can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>Must start and end with a lowercase letter or digit.</li>
     * <li>Must be 2 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling structure.</p>
     */
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
