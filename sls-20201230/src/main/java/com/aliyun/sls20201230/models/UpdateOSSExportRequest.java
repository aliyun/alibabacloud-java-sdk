// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOSSExportRequest extends TeaModel {
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("description")
    public String description;

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
