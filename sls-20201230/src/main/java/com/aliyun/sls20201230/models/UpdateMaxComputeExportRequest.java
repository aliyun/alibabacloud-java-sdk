// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMaxComputeExportRequest extends TeaModel {
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

    public static UpdateMaxComputeExportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaxComputeExportRequest self = new UpdateMaxComputeExportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaxComputeExportRequest setConfiguration(MaxComputeExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public MaxComputeExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateMaxComputeExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMaxComputeExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
