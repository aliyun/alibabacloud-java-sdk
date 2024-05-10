// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExport extends TeaModel {
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public String status;

    public static OSSExport build(java.util.Map<String, ?> map) throws Exception {
        OSSExport self = new OSSExport();
        return TeaModel.build(map, self);
    }

    public OSSExport setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public OSSExport setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public OSSExport setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OSSExport setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public OSSExport setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public OSSExport setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OSSExport setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
