// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class OSSExport extends TeaModel {
    /**
     * <p>Oss Export Configuration</p>
     */
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1718787534</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>OSS投递描述</p>
     * 
     * <strong>example:</strong>
     * <p>my-oss-job</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>OSS投递任务显示名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-oss-job</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>最后一次修改的时间</p>
     * 
     * <strong>example:</strong>
     * <p>1718787681</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>OSS投递名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>export-oss-1234567890-123456</p>
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
     * <p>投递任务的状态</p>
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
