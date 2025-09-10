// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutConsumeProcessorRequest extends TeaModel {
    /**
     * <p>Consumption processor configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ConsumeProcessorConfiguration configuration;

    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>filter-get-request</p>
     */
    @NameInMap("displayName")
    public String displayName;

    public static PutConsumeProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConsumeProcessorRequest self = new PutConsumeProcessorRequest();
        return TeaModel.build(map, self);
    }

    public PutConsumeProcessorRequest setConfiguration(ConsumeProcessorConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ConsumeProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    public PutConsumeProcessorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutConsumeProcessorRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
