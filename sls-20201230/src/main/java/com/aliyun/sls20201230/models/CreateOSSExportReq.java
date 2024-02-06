// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSExportReq extends TeaModel {
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("name")
    public String name;

    public static CreateOSSExportReq build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSExportReq self = new CreateOSSExportReq();
        return TeaModel.build(map, self);
    }

    public CreateOSSExportReq setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSExportReq setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSExportReq setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSExportReq setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
