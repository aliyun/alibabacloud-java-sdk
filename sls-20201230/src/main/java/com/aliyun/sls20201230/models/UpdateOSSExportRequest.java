// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOSSExportRequest extends TeaModel {
    /**
     * <p>The configuration details of the job.</p>
     */
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    /**
     * <p>The description of the job.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-oss-job</p>
     */
    @NameInMap("displayName")
    public String displayName;

    public static UpdateOSSExportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOSSExportRequest self = new UpdateOSSExportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOSSExportRequest setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateOSSExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOSSExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
