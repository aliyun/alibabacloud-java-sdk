// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExport extends TeaModel {
    /**
     * <p>MC投递配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public MaxComputeExportConfiguration configuration;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1718787534</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>job description</p>
     * 
     * <strong>example:</strong>
     * <p>MaxComputeExport</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>job displayName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxComputeExport</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>最近一次修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>1718787681</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>job name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxComputeExport</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>任务ID</p>
     * 
     * <strong>example:</strong>
     * <p>c7f01719d9feb105fc9d8df92af62010</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>投递任务状态</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static MaxComputeExport build(java.util.Map<String, ?> map) throws Exception {
        MaxComputeExport self = new MaxComputeExport();
        return TeaModel.build(map, self);
    }

    public MaxComputeExport setConfiguration(MaxComputeExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public MaxComputeExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public MaxComputeExport setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MaxComputeExport setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MaxComputeExport setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MaxComputeExport setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public MaxComputeExport setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MaxComputeExport setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public MaxComputeExport setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
