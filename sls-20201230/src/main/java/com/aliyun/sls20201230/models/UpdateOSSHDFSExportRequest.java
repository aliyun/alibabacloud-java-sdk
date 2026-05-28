// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOSSHDFSExportRequest extends TeaModel {
    /**
     * <p>The configuration details of the job.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-oss-hdfs-job</p>
     */
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
