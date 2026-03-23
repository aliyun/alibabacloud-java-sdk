// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateGCSIngestionRequest extends TeaModel {
    /**
     * <p>The configuration of the GCS import task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public GCSIngestionConfiguration configuration;

    /**
     * <p>The description of the GCS import task.</p>
     * 
     * <strong>example:</strong>
     * <p>gcs导入</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the GCS import task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gcs导入</p>
     */
    @NameInMap("displayName")
    public String displayName;

    public static UpdateGCSIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGCSIngestionRequest self = new UpdateGCSIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGCSIngestionRequest setConfiguration(GCSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GCSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateGCSIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGCSIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
