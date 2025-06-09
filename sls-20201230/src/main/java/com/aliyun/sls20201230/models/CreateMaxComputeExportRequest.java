// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMaxComputeExportRequest extends TeaModel {
    /**
     * <p>The setting of the MaxCompute data shipping job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public MaxComputeExportConfiguration configuration;

    /**
     * <p>The description of the MaxCompute data shipping job.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the MaxCompute data shipping job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mc-job</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The unique identifier of the MaxCompute data shipping job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>export-mc-1234567890-123456</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateMaxComputeExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaxComputeExportRequest self = new CreateMaxComputeExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaxComputeExportRequest setConfiguration(MaxComputeExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public MaxComputeExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateMaxComputeExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMaxComputeExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateMaxComputeExportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
