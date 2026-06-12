// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateGCSIngestionRequest extends TeaModel {
    /**
     * <p>The ingestion configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public GCSIngestionConfiguration configuration;

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
     * <p>The job name. Must be unique within the same project. Naming rules:</p>
     * <ul>
     * <li><p>Can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>Must start and end with a lowercase letter or digit.</p>
     * </li>
     * <li><p>Must be 2 to 64 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateGCSIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGCSIngestionRequest self = new CreateGCSIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateGCSIngestionRequest setConfiguration(GCSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GCSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateGCSIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGCSIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateGCSIngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
