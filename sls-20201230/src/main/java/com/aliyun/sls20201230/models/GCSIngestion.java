// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GCSIngestion extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public GCSIngestionConfiguration configuration;

    /**
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>gcs ingestion</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gcs ingestion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-gcs-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>c7f01719d9feb105fc9d8df92af62010</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static GCSIngestion build(java.util.Map<String, ?> map) throws Exception {
        GCSIngestion self = new GCSIngestion();
        return TeaModel.build(map, self);
    }

    public GCSIngestion setConfiguration(GCSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GCSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public GCSIngestion setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GCSIngestion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GCSIngestion setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GCSIngestion setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GCSIngestion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GCSIngestion setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public GCSIngestion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
