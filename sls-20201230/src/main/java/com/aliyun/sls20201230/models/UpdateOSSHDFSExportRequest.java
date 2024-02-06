// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOSSHDFSExportRequest extends TeaModel {
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    public static UpdateOSSHDFSExportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOSSHDFSExportRequest self = new UpdateOSSHDFSExportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOSSHDFSExportRequest setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public UpdateOSSHDFSExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOSSHDFSExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
