// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateGCSIngestionRequest extends TeaModel {
    /**
     * <p>The configuration of the Ingestion.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public GCSIngestionConfiguration configuration;

    /**
     * <p>The description of the Ingestion.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The Display Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the Ingestion. The name must be unique within the same Project and must meet the following requirements:</p>
     * <p>Within the same Project, Job names must be unique.</p>
     * <ul>
     * <li><p>Must contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>Must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>Must be 2 to 64 characters long.</p>
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
