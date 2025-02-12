// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutIngestProcessorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public IngestProcessorConfiguration configuration;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    public static PutIngestProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        PutIngestProcessorRequest self = new PutIngestProcessorRequest();
        return TeaModel.build(map, self);
    }

    public PutIngestProcessorRequest setConfiguration(IngestProcessorConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public IngestProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    public PutIngestProcessorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutIngestProcessorRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
