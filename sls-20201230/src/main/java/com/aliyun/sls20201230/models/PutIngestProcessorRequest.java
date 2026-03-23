// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutIngestProcessorRequest extends TeaModel {
    /**
     * <p>The configuration of the ingest processor.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public IngestProcessorConfiguration configuration;

    /**
     * <p>The description of the ingest processor.</p>
     * 
     * <strong>example:</strong>
     * <p>将Nginx日志通过正则解析提取字段。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the ingest processor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Nginx日志解析</p>
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
