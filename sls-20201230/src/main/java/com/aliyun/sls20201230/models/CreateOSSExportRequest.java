// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSExportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateOSSExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSExportRequest self = new CreateOSSExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateOSSExportRequest setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSExportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
