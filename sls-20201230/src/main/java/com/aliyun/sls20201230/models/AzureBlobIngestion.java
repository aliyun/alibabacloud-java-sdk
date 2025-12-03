// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AzureBlobIngestion extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public AzureBlobIngestionConfiguration configuration;

    /**
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>azure blob ingestion</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>azure blob ingestion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>1714360481</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingest-azure-blob-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ingest-processor-1756802123-953901</p>
     */
    @NameInMap("processorId")
    public String processorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

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

    public static AzureBlobIngestion build(java.util.Map<String, ?> map) throws Exception {
        AzureBlobIngestion self = new AzureBlobIngestion();
        return TeaModel.build(map, self);
    }

    public AzureBlobIngestion setConfiguration(AzureBlobIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AzureBlobIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public AzureBlobIngestion setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AzureBlobIngestion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AzureBlobIngestion setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AzureBlobIngestion setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public AzureBlobIngestion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AzureBlobIngestion setProcessorId(String processorId) {
        this.processorId = processorId;
        return this;
    }
    public String getProcessorId() {
        return this.processorId;
    }

    public AzureBlobIngestion setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

    public AzureBlobIngestion setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public AzureBlobIngestion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
