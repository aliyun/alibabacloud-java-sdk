// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSHDFSExportRequest extends TeaModel {
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("name")
    public String name;

    public static CreateOSSHDFSExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSHDFSExportRequest self = new CreateOSSHDFSExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateOSSHDFSExportRequest setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSHDFSExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSHDFSExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSHDFSExportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
