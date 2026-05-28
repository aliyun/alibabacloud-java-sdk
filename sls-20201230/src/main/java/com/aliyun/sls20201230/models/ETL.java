// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETL extends TeaModel {
    /**
     * <p>The configurations of the data transformation job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ETLConfiguration configuration;

    /**
     * <p>The time when the data transformation job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1714274900</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>job description</p>
     * 
     * <strong>example:</strong>
     * <p>ETL</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>job displayName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ETL</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The time when the data transformation job was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1714274900</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>job name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ETL</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the scheduler.</p>
     * 
     * <strong>example:</strong>
     * <p>f0eb655e501a8780808d1970ef6d04c4</p>
     */
    @NameInMap("scheduleId")
    public String scheduleId;

    /**
     * <p>The status of the data transformation job. Valid values:</p>
     * <ol>
     * <li>RUNNING</li>
     * <li>STOPPING</li>
     * <li>STOPPED</li>
     * <li>SUCCEEDED</li>
     * <li>FAILED</li>
     * <li>STARTING</li>
     * <li>RESTARTING</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static ETL build(java.util.Map<String, ?> map) throws Exception {
        ETL self = new ETL();
        return TeaModel.build(map, self);
    }

    public ETL setConfiguration(ETLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ETLConfiguration getConfiguration() {
        return this.configuration;
    }

    public ETL setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ETL setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ETL setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ETL setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ETL setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ETL setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ETL setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
