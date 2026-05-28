// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExport extends TeaModel {
    /**
     * <p>The OSS export configuration.</p>
     */
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    /**
     * <p>The time when the OSS data shipping job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description of the OSS data shipping job.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a oss export</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the OSS data shipping job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a oss export</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The time when the OSS data shipping job was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The name of the OSS data shipping job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myossexportjob</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the OSS data shipping job.</p>
     * 
     * <strong>example:</strong>
     * <p>c7f01719d9feb105fc9d8df92af62010</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>The status of the OSS data shipping job.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
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

    public OSSExport setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public OSSExport setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
